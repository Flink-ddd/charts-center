package com.panda.charts.controller;

import org.redisson.api.RLock;
import org.redisson.api.RReadWriteLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author muxiaohui
 */
@RestController
@RequestMapping("/redission/")
public class RedissionController {
    @Autowired
    private RedissonClient redissonClient;
    private final static String LOCK = "I_AM_LOCK";
    @Autowired
    RedissonClient redisson;
    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 分布式情况下，基于Redission实现分布式锁。
     * @desc
     * 1、在分布式系统环境下，一个方法在同一时间只能被一个机器的一个线程执行；
     * 2、高可用的获取锁与释放锁；
     * 3、高性能的获取锁与释放锁；
     * 4、具备可重入特性；
     * 5、具备锁失效机制，防止死锁；
     * 6、具备非阻塞锁特性，即没有获取到锁将直接返回获取锁失败。
     */
    @GetMapping("list")
    public String getString() {
        // 1、获取一把锁，只要锁的名字一样，既是同一把锁
        RLock lock = redissonClient.getLock(LOCK);
        // 2、加锁
        // 阻塞式等待
        lock.lock();
//        // 10s自动解锁，指定时间一定要大于业务时间（不然会报错，没把握就不要用）
//        lock.lock (10, TimeUnit.SECONDS);
        try {
            System.out.println(Thread.currentThread().getName() + "：\t 获得锁");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 3、解锁
            lock.unlock();
            System.out.println(Thread.currentThread().getName() + "：\t 释放锁");
        }
        return "123";
    }

    /**
     * 并发写测试
     */
    @GetMapping("write")
    @ResponseBody
    public String writeValue() {
        RReadWriteLock myLock = redisson.getReadWriteLock("my_lock");
        RLock rLock = myLock.writeLock();
        rLock.lock();
        String s = "";
        try {
            System.out.println("写锁加锁成功..." + Thread.currentThread().getId());
            s = UUID.randomUUID().toString();
            TimeUnit.SECONDS.sleep(30);
            redisTemplate.opsForValue().set("writeValue", s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("写锁解锁成功..." + Thread.currentThread().getId());
            rLock.unlock();
        }
        return s;
    }

    /**
     * 并发读测试
     */
    @GetMapping("read")
    @ResponseBody
    public String readValue() {
        RReadWriteLock myLock = redisson.getReadWriteLock("my_lock");
        RLock rLock = myLock.readLock();
        rLock.lock();
        String s = "";
        try {
            System.out.println("读锁加锁成功..." + Thread.currentThread().getId());
            s = (String) redisTemplate.opsForValue().get("writeValue");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("读锁解锁成功..." + Thread.currentThread().getId());
            rLock.unlock();
        }
        return s;
    }

    /**
     * 保证一定能读到最新数据，修改期间，写锁是一个排它锁（互斥锁）。读锁是一个共享锁
     * （1）读+读：相当于无锁，并发读情况下，只会在 redis 中记录好，所有当前的读锁，他们都会加锁成功。
     * （2）写+读：等待写锁释放
     * （3）写+写：阻塞方式
     * （4）读+写：有读锁，写也需要等待
     *
     * 只要有写的存在，都必须等待
     */
}
