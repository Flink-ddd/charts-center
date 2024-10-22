package com.panda.charts.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.panda.charts.common.PrimaryKey;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 订单-物流表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_logistics")
public class MOrderLogistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;


    /**
     * 物流类型（1：售前物流、2：售后物流）
     */
    private Integer logisticsType;

    /**
     * 物流来源（1：商家物流、2：用户物流）
     */
    private Integer logisticsSource;

    /**
     * 售前主订单号
     */
    private String mainOrderNo;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 售前订单号
     */
    private String orderNo;

    /**
     * 售后订单号
     */
    private String returnNo;

    /**
     * 物流单号
     */
    private String expressNo;

    /**
     * 物流公司编码
     */
    private String expressCode;

    /**
     * 物流公司名称
     */
    private String expressName;

    /**
     * 最新物流
     */
    private String latestLogistics;

    /**
     * 物流备注
     */
    private String remark;

    /**
     * 注册来源类型（1.PC；2.小程序；3.H5；4.APP）
     */
    private String sdScrtp;

    /**
     * 注册伙伴产品(业务项目: 0军考)
     */
    private String idScrvar;

    /**
     * 注册上传机构（公司号；1.融通）
     */
    private String idScrorg;

    /**
     * 启用禁用（是否失效）0启用，1禁用
     */
    private Integer fgDis;

    /**
     * 是否删除，0未删除，1已删除
     */
    private Integer fgDel;

    /**
     * 创建用户
     */
    private Long idUsrCrt;

    /**
     * 创建时间
     */
    private Date dtmCrt;

    /**
     * 最后更新用户
     */
    private Long idUsrEdt;

    /**
     * 最后更新时间
     */
    private Date dtmEdt;

    /**
     * 记录版本号
     */
    private String verNo;


}
