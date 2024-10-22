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
 * 售后主表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_return")
public class MOrderReturn implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 售后单号
     */
    private String returnNo;

    /**
     * 售前订单号
     */
    private String orderNo;

    /**
     * 订单级别（1：主订单、2：子订单）
     */
    private Integer orderLevel;

    /**
     * 申请时间
     */
    private Date applyTime;

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
     * 退款金额（当前售后单所退总金额）
     */
    private BigDecimal applyMoney;

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
     * 售后状态 1：待审核、2：已驳回、3：已退款、4：已完成、5：待寄回、6：商家待签收、7：已取消
     */
    private Integer returnStatus;

    /**
     * 商家id
     */
    private Long businessId;

    /**
     * 处理时间
     */
    private Date disposeTime;

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
     * 退货方式 1：自行寄回、2：三方代发
     */
    private Integer userDeliveryType;

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
     * 是否操作驳回和取消（0：否，1：是），该字段作为判断有效的售后单可以申请退款的操作。
     */
    private Integer isOperate;

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
