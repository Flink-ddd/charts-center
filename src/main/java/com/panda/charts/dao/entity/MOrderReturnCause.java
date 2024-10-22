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
 * 售后原因表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_return_cause")
public class MOrderReturnCause implements Serializable {

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
     * 用户ID
     */
    private Long userId;

    /**
     * 售后类型 1-仅退款;2-退货退款;3-换货;4-补货
     */
    private Integer type;

    /**
     * 申请原因类型（0：与商家协商一致、1：与实际发货时间不符、2：地址/联系人/联系电话信息错误、3：商品缺货、4：拍错/多拍/不想要、5：商品压损、6：实物与商品描述不符（批号/包装）、7：商家发错货、8：商品质量问题）
     */
    private Integer applyCauseType;

    /**
     * 申请原因
     */
    private String applyCause;

    /**
     * 是否启用 1-启用  2-禁用
     */
    private Integer status;

    /**
     * 原因分类  1-用户,2-商家
     */
    private Integer causeType;

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
