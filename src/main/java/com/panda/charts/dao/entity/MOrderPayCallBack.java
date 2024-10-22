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
import java.util.Date;

/**
 * <p>
 * 订单-支付回调表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_pay_call_back")
public class MOrderPayCallBack implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 主订单编号
     */
    private String mainOrderNo;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 商户订单号
     */
    private String merOrderNo;

    /**
     * 支付单号
     */
    private String payNo;

    /**
     * 商户退款订单号
     */
    private String refuseOrderNo;

    /**
     * 子订单编号
     */
    private String orderSubNo;

    /**
     * 外部支付单号
     */
    private String outRefundOrderNo;

    /**
     * 外部退款订单号
     */
    private String outOrderNo;

    /**
     * 微信小程序wxapp_id标识
     */
    private Integer wxappId;

    /**
     * 请求银联携带的参数
     */
    private String requestParam;

    /**
     * 接口返回回调参数信息
     */
    private String content;

    /**
     * 支付结果
     */
    private String resultUrl;

    /**
     * 支付单失效等错误情况跳转地址
     */
    private String redirectUrl;

    /**
     * 判断是否发送资管（1：未发送、2：已发送）
     */
    private Integer isSendZg;

    /**
     * 支付状态(NEW(0：未支付)，PAID(1：支付中)，PAYING(2：支付完成))
     */
    private Integer paymentStatus;

    /**
     * 退款状态  0：未退款，1，退款中，2：已退款，3：退款失败
     */
    private Integer refundStatus;

    /**
     * 实际支付方式  1：微信、2：支付宝、3：银联、4：京东
     */
    private String actualPaymentType;

    /**
     * 金额
     */
    private BigDecimal amount;

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
