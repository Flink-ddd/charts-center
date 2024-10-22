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
 * 订单支付信息
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_payment")
public class MOrderPayment implements Serializable {

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
     * 平台id
     */
    private String appId;

    /**
     * 微信open_id
     */
    private String openId;

    /**
     * 微信小程序wxapp_id标识
     */
    private String wxappId;

    /**
     * 交易单号
     */
    private String paymentNo;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 流水号
     */
    private String paymentSerialNo;

    /**
     * 商户号订单
     */
    private String merOrderId;

    /**
     * 支付商户号
     */
    private String merchant;

    /**
     * 签约商户子商户
     */
    private String subMerId;

    /**
     * 支付账号
     */
    private String payAccount;

    /**
     * 支付类型
     */
    private Integer payType;

    /**
     * 支付方式
     */
    private Integer payWay;

    /**
     * 支付状态(NEW(0：未支付)，PAID(1：支付中)，PAYING(2：支付完成))，3：部分收款，4：取消支付
     */
    private Integer paymentStatus;

    /**
     * 交易类型
     */
    private Integer tradeType;

    /**
     * 订单类型（1、B2B；2、B2C；3、普通订单；4、拼团订单；5、秒杀；6、卡密订单；7、砍价订单；8、交易订单；9、退款订单; 10、实体订单；11、虚拟订单）
     */
    private Integer orderType;

    /**
     * 支付通道类型
     */
    private Integer channelType;

    /**
     * 场景类型（ONLINE_APP：线上移动端支付, ONLINE_PC：线上 PC 端支付, OFFLINE：线下支付:）
     */
    private Integer sceneType;

    /**
     * 接入方式
     */
    private Integer accessType;

    /**
     * 通道业务类型生活服务消费-100007
     */
    private String bizType;

    /**
     * 系统类型
     */
    private String sysType;

    /**
     * 请求的平台类型
     */
    private String reqPlat;

    /**
     * 币中类型: CNY
     */
    private String currency;

    /**
     * 订单名称
     */
    private String tradeName;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 二维码qrCodeId，C2B扫码需要
     */
    private String qrCodeId;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 金额
     */
    private BigDecimal paymentAmount;

    /**
     * 支付信息
     */
    private String paymentInfo;

    /**
     * 回调参数
     */
    private String callBackParam;

    /**
     * 成功异步返回地址
     */
    private String callBackUrl;

    /**
     * 成功同步返回地址
     */
    private String showUrl;

    /**
     * 支付回调信息
     */
    private String payCallBackInfo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 版本号
     */
    private String version;

    /**
     * 支付时间
     */
    private LocalDateTime paymentTime;

    /**
     * 过期时间(默认过期时间默认配置3个小时)
     */
    private String expireTime;

    /**
     * 交易时间
     */
    private String tradeTime;

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
