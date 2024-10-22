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
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 售后-节点-操作表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_return_node_operate")
public class MOrderReturnNodeOperate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 售后单号
     */
    private String returnNo;

    /**
     * 售前订单号
     */
    private String orderNo;

    /**
     * 物流单号
     */
    private String expressNo;

    /**
     * 售后类型 1-仅退款;2-退货退款;3-换货;4-补货
     */
    private Integer operateType;

    /**
     * 售后进度状态
     */
    private Integer operateStatus;

    /**
     * 适用于用户端的售后进度描述
     */
    private String operateDesc;

    /**
     * 适用于商家端的售后状态描述
     */
    private String operateBusinessDesc;

    /**
     * 驳回理由，仅适用于商家的审核拒绝理由
     */
    private String rejectReasons;

    /**
     * 售后进度时间
     */
    private LocalDateTime operateTime;

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
