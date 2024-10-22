package com.panda.charts.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 售后退款日志表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_return_refund_error")
public class MOrderReturnRefundError implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
//    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 售后服务单号
     */
    private String returnNo;

    /**
     * 商户服务单号
     */
    private String merOrderId;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 1-失败 2-成功 3-处理中
     */
    private Integer refundState;

    /**
     * 1-原重试 2-不重试 3-新流水号重试
     */
    private Integer isRetry;

    /**
     * 退款单号
     */
    private String refundNo;

    /**
     * 外部退款单号
     */
    private String refundOrderNo;

    /**
     * 备注
     */
    private String remarks;

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
