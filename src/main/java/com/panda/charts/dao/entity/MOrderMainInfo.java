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
 * 主订单表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_main_info")
public class MOrderMainInfo implements Serializable {

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
     * 用户id
     */
    private Long userId;

    /**
     * 销售渠道编码
     */
    private String channelCode;

    /**
     * 小程序id
     */
    private Integer wxappId;

    /**
     * 机构ID
     */
    private String organId;

    /**
     * 拼团ID
     */
    private Integer groupsId;

    /**
     * 商家优惠券id
     */
    private Integer couponId;

    /**
     * 返现活动ID
     */
    private Integer cashbackId;

    /**
     * 满包邮模板id
     */
    private Integer freeExpressTempId;

    /**
     * 支付中心应用ID
     */
    private String appId;

    /**
     * WX_JSAPI：微信公众号支付、WX_NATIVE：微信原生扫码支付、WX_APP：微信APP支付、WX_MWEB：微信H5支付、IAP：苹果应用内支付、ALIPAY_MOBILE：支付宝移动支付、ALIPAY_PC：支付宝PC支付、ALIPAY_WAP：支付宝WAP支付、ALIPAY_QR：支付宝当面付之扫码支付
     */
    private String channelType;

    /**
     * 订单渠道（1：内部业务线渠道、2：三方业务渠道；）
     */
    private Integer orderChannel;

    /**
     * 订单来源（1：PC、2：小程序、3：H5、4：APP）
     */
    private Integer orderSource;

    /**
     * 订单类型（1、B2B；2、B2C；3、普通订单；4、拼团订单；5、秒杀；6、卡密订单；7、砍价订单；8、交易订单；9、退款订单; 10、图书订单；11、电子订单）
     */
    private Integer orderType;

    /**
     * 订单业务类型（内部业务线扩展字段）
     */
    private Integer orderBusinessType;

    /**
     * 产品来源（内部业务线扩展字段）
     */
    private Integer orderProductType;

    /**
     * 买家类型（1、用户；2、公司）
     */
    private Integer buyersType;

    /**
     * 商家类型（1、默认商家、2：普通入驻商家、3：外部签约商家、4：其他）
     */
    private Integer businessType;

    /**
     * 销售类型（1：现货、2：预售）
     */
    private Integer saleType;

    /**
     * 支付方式 （1：微信支付、2：支付宝支付、3：银联支付、4：余额支付、5：医保支付、6：在线支付、7：对公转账）
     */
    private Integer payChannel;

    /**
     * 支付状态(NEW(0：未支付)，PAID(1：支付中)，PAYING(2：支付完成))，3：部分收款，4：取消支付
     */
    private Integer paymentStatus;

    /**
     * 订单状态(NEW(0：新建)，DONE(1：完成),CANCEL(2：已取消),CLOSE(3：超时关闭))
     */
    private Integer orderStatus;

    /**
     * 退款状态(0：退款中、1：退款成功、2：退款失败、3：退款关闭)
     */
    private Integer refundStatus;

    /**
     * 结算状态(NEW(0：未结算)，PAID(1：已结算)，CONFIRM(2：待确认)，FAIL(3：结算失败))
     */
    private Integer accountState;

    /**
     * 是否为折扣商品订单(1:是;2:否)
     */
    private Integer isRebate;

    /**
     * 此订单是否开通会员（开通为会员订单ID，未开通为-1）
     */
    private Integer isMember;

    /**
     * 快递订单是否入账（0=未入账；1=已入账）
     */
    private Integer isSettlement;

    /**
     * 是否为票务订单：1是，2不是
     */
    private Integer isTicket;

    /**
     * 过期前提醒状态，1已提醒；2未提醒
     */
    private Integer remindState;

    /**
     * 需要同步给三方 1 是 0 否
     */
    private Integer needSyn;

    /**
     * 同步三方数据状态回调
     */
    private Integer synSuccess;

    /**
     * 购买方式: 0 购物车下单，1 立即购买
     */
    private Integer purchaseType;

    /**
     * 子订单个数
     */
    private Integer subOrderCount;

    /**
     * 买家名称
     */
    private String buyersName;

    /**
     * 商户号
     */
    private String merchant;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 客户手机号
     */
    private String phone;

    /**
     * 是否自动扣费（0：否、1：是）
     */
    private Integer automaticDeduction;

    /**
     * 是否分批次发货（0：否、1：是）
     */
    private Integer multipleDeliveries;

    /**
     * 配送方式（0：同城配送、1：快递发货、2：到店自提）
     */
    private Integer distributType;

    /**
     * 下单时间
     */
    private Date orderPlaceTime;

    /**
     * 订单支付时间
     */
    private Date orderPayTime;

    /**
     * 订单结算时间
     */
    private Date orderSettleTime;

    /**
     * 订单配送时间
     */
    private Date orderDeliTime;

    /**
     * 订单退款时间
     */
    private Date orderRefundTime;

    /**
     * 订单完成时间
     */
    private Date doneTime;

    /**
     * 订单取消时间
     */
    private Date cancelTime;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 应付金额
     */
    private BigDecimal payPrice;

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
     * 平台服务费
     */
    private BigDecimal servicePrice;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 交易手续费
     */
    private BigDecimal transactionFee;

    /**
     * 微信返回的支付方式
     */
    private String bankType;

    /**
     * 实际支付方式 1：微信、2：支付宝、3：银联、4：京东
     */
    private String actualPaymentType;

    /**
     * 订单备注
     */
    private String remark;

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
