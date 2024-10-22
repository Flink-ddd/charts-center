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
 * 订单基础查询条件表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_condition")
public class MOrderCondition implements Serializable {

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
     * 售后单号
     */
    private String returnNo;

    /**
     * 物流单号
     */
    private String expressNo;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商家ID
     */
    private Long businessId;

    /**
     * 商家名称
     */
    private String businessName;

    /**
     * 订单所属（1：普通订单管理、2：售后订单管理）
     */
    private Integer orderCondType;

    /**
     * 售后类型 1-仅退款、2-退货退款、3-换货、4-补货
     */
    private Integer returnType;

    /**
     * 售后状态 1：待审核、2：已驳回、3：已退款、4：已完成、5：待寄回、6：商家待签收、7：已取消
     */
    private Integer returnStatus;

    /**
     * 订单渠道（1：内部业务线渠道、2：三方业务渠道；）
     */
    private Integer orderChannel;

    /**
     * 订单来源（1：PC、2：小程序、3：H5、4：APP）
     */
    private Integer orderSource;

    /**
     * 订单类型（1、B2B；2、B2C；3、普通订单；4、拼团订单；5、秒杀；6、卡密订单；7、砍价订单；8、交易订单；9、退款订单; 10、实体订单；11、虚拟订单）
     */
    private String orderType;

    /**
     * 订单种类： 1：课程，2：图书，3：1v1，4：课程包，5：辅导产品
     */
    private String orderClass;

    /**
     * 订单业务类型（10、购物订单；20、售后订单；30、退款订单；）该字段区分服务单与实体物流单，后续再加状态。
     */
    private Integer orderBusinessType;

    /**
     * 产品功能来源（0：普通下单、1：代客下单）
     */
    private Integer orderProductType;

    /**
     * 物流单状态(0：待支付、1：待发货、2：待收货、3：待评价、4：已完成、5：交易关闭、6：已取消)，针对于实体/虚拟商品物流单的状态
     */
    private Integer logisticStatus;

    /**
     * 支付方式 （1：微信、2：支付宝、3：银联、4：京东）
     */
    private Integer payChannel;

    /**
     * 购买方式 0：购物车下单、1：立即购买
     */
    private Integer purchaseType;

    /**
     * 实际支付方式  1：微信、2：支付宝、3：银联、4：京东
     */
    private String actualPaymentType;

    /**
     * 订单发票标识(0:不需要发票  1:需要发票）
     */
    private Integer invoiceState;

    /**
     * 支付状态(NEW(0：未支付)，PAID(1：支付中)，PAYING(2：支付完成))，3：部分收款，4：取消支付
     */
    private Integer paymentStatus;

    /**
     * 订单级别（1：主订单、2：子订单）
     */
    private Integer orderLevel;

    /**
     * 下单时间
     */
    private Date orderPlaceTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 售后申请时间
     */
    private Date applyTime;

    /**
     * 商家订单备注
     */
    private String businessRemark;

    /**
     * 订单操作状态（0：正常、1：已失效）
     */
    private Integer orderOperateStatus;

    /**
     * 订单备注
     */
    private String remark;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 收件人手机号
     */
    private String phone;

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
