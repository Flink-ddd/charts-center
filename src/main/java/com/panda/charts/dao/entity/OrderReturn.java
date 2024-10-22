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
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 售后主表
 * </p>
 *
 * @author muxh
 * @since 2022-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_return")
public class OrderReturn implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 域ID
     */
    private String domainId;

    /**
     * 售后单号
     */
    private String returnNo;

    /**
     * 售前订单号
     */
    private String orderNo;

    /**
     * 订单级别（1：主订单、2：子订单、3：分支子订单）
     */
    private Integer orderLevel;

    /**
     * 申请时间
     */
    private LocalDateTime applyTime;

    /**
     * 申请售后的商品ID
     */
    private Long goodsId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 买家类型
     */
    private Integer linkmanType;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系人手机
     */
    private String linkmanMobile;

    /**
     * 申请数量
     */
    private Integer applyNum;

    /**
     * 售后类型 1-仅退款;2-退货退款;3-换货;4-补货
     */
    private Integer type;

    /**
     * 换货/退货地址是否使用原地址 1-是 2-不是
     */
    private Integer isOriginalAdrr;

    /**
     * 换货寄回地址---寄给用户
     */
    private String replacementAdrr;

    /**
     * 换货退货取件地址,针对骑士
     */
    private String userDeliveryAddr;

    /**
     * 用户寄回配送方式 1-第三方 2-骑士
     */
    private Integer userDeliveryModel;

    /**
     * 是否退运费  0-不退  1-退
     */
    private Integer isReturnFreight;

    /**
     * 用户问题描述
     */
    private String descriptionUser;

    /**
     * 商家处理问题描述
     */
    private String descriptionBusiness;

    /**
     * 售后状态 1：待审核、2：已驳回、3：待退款、4：已完成、5：待退回、6：商户待签收、7：客户待签收、8：已取消、9：确认收款、10：换货中、11：补货中
     */
    private Integer status;

    /**
     * 商家id
     */
    private Long businessId;

    /**
     * 处理时间
     */
    private LocalDateTime disposeTime;

    /**
     * 商家联系人
     */
    private String businessLinkman;

    /**
     * 商家电话
     */
    private String businessLinkmanMobile;

    /**
     * 商家地址
     */
    private String businessAdrr;

    /**
     * 订单总金额
     */
    private BigDecimal payMoney;

    /**
     * 实退金额   包含运费
     */
    private BigDecimal returnMoney;

    /**
     * 商家审核通过备注
     */
    private String businessAuditRemark;

    /**
     * 商家寄出方式 1-第三方 2-骑士
     */
    private Boolean businessDeliveryModel;

    /**
     * 到商家取货地址 针对骑士
     */
    private String businessDeliveryAddr;

    /**
     * 退还运费金额
     */
    private BigDecimal freightMoney;

    /**
     * 用户寄回商家快递单号
     */
    private String expressNoFrom;

    /**
     * 用户寄回商家快递公司编码
     */
    private String expressFromNo;

    /**
     * 用户寄回商家快递公司名称
     */
    private String expressFromName;

    /**
     * 商家寄回用户快递单号
     */
    private String expressNoTo;

    /**
     * 商家寄回用户快递公司编码
     */
    private String expressToNo;

    /**
     * 商家寄回用户快递公司名称
     */
    private String expressToName;

    /**
     * 退款单号
     */
    private Integer refundOrderNo;

    /**
     * 用户取消服务单标识 0-有效  1-取消
     */
    private Integer isCancel;

    /**
     * 原订单状态
     */
    private Integer orderStatus;

    /**
     * 优惠价格
     */
    private BigDecimal preferentialPrice;

    /**
     * 是否收货 1-收货 2- 未收货
     */
    private Integer isReceived;

    /**
     * 退款类型 1：原路返回、2：余额
     */
    private Integer refundType;

    /**
     * 退款方式  1：线下退款、2：线上退款
     */
    private Integer refundMode;

    /**
     * 用户寄回骑士单号
     */
    private String userKnightNo;

    /**
     * 商户寄出骑士单号  用于售后
     */
    private String businessKnightNo;

    /**
     * 当前售后单包含的邮费地区模式，0：包邮、1：偏远地区，多个以，隔开。
     */
    private String regionMode;

    /**
     * 创建时间
     */
    private Date dateCreated;

    /**
     * 更新时间
     */
    private Date dateUpdated;

    /**
     * 是否删除(0=未删除1=已删除)
     */
    private Integer isDelete;


}
