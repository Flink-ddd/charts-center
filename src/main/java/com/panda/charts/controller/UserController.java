package com.panda.charts.controller;

import com.alibaba.fastjson.JSON;
import com.panda.charts.common.RepBean;
import com.panda.charts.common.Result;
import com.panda.charts.service.CountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 统计数据调度控制器
 *
 * @author muxiaohui
 */
@RestController
@RequestMapping("/user/")
@Api(value = "用户统计数据相关接口", tags = "用户统计数据相关接口")
@Slf4j
public class UserController {
    @Resource
    private CountService countService;

    private static List<Map<String, Object>> dataList = new ArrayList<>(100);

    /**
     * 获取各地区注册人数
     *
     * @return
     */
    @RequestMapping(value = "address/totalNum", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取各地区注册人数", notes = "获取各地区注册人数")
    public Result genderTotalNum() {
        List<RepBean> dataList = countService.getDataStreamCountMap(Integer.TYPE, "FLINK_USER_ADDRESS_REGISTER_NUM");
        log.info("获取各地区注册人数[{}]", JSON.toJSONString(dataList));
        return Result.of(dataList, "获取各地区注册人数成功");
    }
}
