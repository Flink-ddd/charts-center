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
 * 子订单表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_sub")
public class MOrderSub implements Serializable {

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
     * 子订单编号
     */
    private String orderSubNo;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商家ID
     */
    private Long businessId;

    /**
     * 子订单状态(NEW(0：新建)，DONE(1：完成),CANCEL(2：已取消),CLOSE(3：超时关闭))
     */
    private Integer orderStatus;

    /**
     * 物流单状态(0：待支付、1：待发货、2：待收货、3：待评价、4：已完成、5：交易关闭、6：已取消)，针对于实体/虚拟商品物流单的状态
     */
    private Integer logisticStatus;

    /**
     * 支付状态(NEW(0：未支付)，PAID(1：支付中)，PAYING(2：支付完成))，3：部分收款，4：取消支付
     */
    private Integer paymentStatus;

    /**
     * 支付方式 （1：微信、2：支付宝、3：银联、4：京东）
     */
    private Integer payChannel;

    /**
     * 退款状态(0：退款中、1：退款成功、2：退款失败、3：退款关闭)
     */
    private Integer refundStatus;

    /**
     * 配送方式（1：同城配送、2：快递发货、3：到店自提）
     */
    private Integer distributType;

    /**
     * 发货单类型（1：普通物流单、2：售后单、3：分销/分佣单）
     */
    private Integer shipmentOrderType;

    /**
     * 结算状态(NEW(0：未结算)，PAID(1：已结算)，CONFIRM(2：待确认)，FAIL(3：结算失败))
     */
    private Integer accountState;

    /**
     * 订单类型（1、B2B；2、B2C；3、普通订单；4、拼团订单；5、秒杀；6、卡密订单；7、砍价订单；8、交易订单；9、退款订单; 10、实体订单；11、虚拟订单）
     */
    private Integer orderType;

    /**
     * 订单种类： 1：课程，2：图书，3：1v1，4：课程包，5：辅导产品
     */
    private Integer orderClass;

    /**
     * 是否申请售后（0：否、1：是）
     */
    private Integer applyAfterSale;

    /**
     * 购买方式: 0 购物车下单，1 立即购买
     */
    private Integer purchaseType;

    /**
     * 实际支付方式  1：微信、2：支付宝、3：银联、4：京东
     */
    private String actualPaymentType;

    /**
     * 应付金额
     */
    private BigDecimal payPrice;

    /**
     * 厂家价格
     */
    private BigDecimal subFactoryPrice;

    /**
     * 平台优惠
     */
    private BigDecimal platformDiscount;

    /**
     * 商家优惠
     */
    private BigDecimal merchantDiscount;

    /**
     * 活动优惠金额
     */
    private BigDecimal fullMinus;

    /**
     * 积分抵扣金额
     */
    private BigDecimal deductAmount;

    /**
     * 会员优惠金额
     */
    private BigDecimal memberAmount;

    /**
     * 运费金额
     */
    private BigDecimal freight;

    /**
     * 运费券
     */
    private BigDecimal freightCoupon;

    /**
     * 商品优惠
     */
    private BigDecimal commodityDiscount;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    /**
     * 实付金额
     */
    private BigDecimal paidAmount;

    /**
     * 平台服务费率
     */
    private BigDecimal servicePrice;

    /**
     * 交易手续费
     */
    private BigDecimal transactionFee;

    /**
     * 可退款金额或者可以理解为该子订单实际支付的金额
     */
    private BigDecimal subAmount;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 商家留言
     */
    private String merchantMessage;

    /**
     * 买家留言
     */
    private String buyerMessage;

    /**
     * 备注
     */
    private String remark;

    /**
     * 下单时间
     */
    private Date orderPlaceTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 配送时间
     */
    private Date distributTime;

    /**
     * 送达时间
     */
    private Date completeTime;

    /**
     * 接收时间
     */
    private Date receiveTime;

    /**
     * 售后周期时间  从收货时间开始算
     */
    private Integer afterSaleCycle;

    /**
     * 是否开启售后服务  1 开启 可申请售后 2 关闭
     */
    private Integer enableAfterSale;

    /**
     * 订单操作状态（0：正常、1：已失效）
     */
    private Integer orderOperateStatus;

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
