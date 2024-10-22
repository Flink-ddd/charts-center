package com.panda.charts.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author muxiaohui
 */
@Configuration
public class RedissonConfig {
    @Value(value = "${spring.redis.host}")
    private String host;
    @Value(value = "${spring.redis.port}")
    private int port;

    /**
     * 单Redis节点模式配置方法
     * </a>
     *
     * @return {@link RedissonClient}
     */
    @Bean(destroyMethod = "shutdown")
    RedissonClient redisson() {
        Config config = new Config();
//        //Redis多节点
//        config.useClusterServers()
//                // 集群状态扫描间隔时间，单位是毫秒
//                .setScanInterval(2000)
//                // 可以用"rediss://"来启用SSL连接
//                .addNodeAddress("redis://127.0.0.1:6379", "redis://127.0.0.1:7001");
        //Redis单节点
        SingleServerConfig singleServerConfig = config.useSingleServer();
        //可以用"rediss://"来启用SSL连接
        String address = "redis://" + host + ":" + port;
        singleServerConfig.setAddress(address);
        //连接池大小:默认值：64
        // singleServerConfig.setConnectionPoolSize()
        return Redisson.create(config);
    }
}
