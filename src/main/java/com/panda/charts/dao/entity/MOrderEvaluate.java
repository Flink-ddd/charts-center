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
 * 订单-评价信息表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_evaluate")
public class MOrderEvaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 子订单编号
     */
    private String orderSubNo;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 商品ID
     */
    private String goodId;

    /**
     * 评价来源（1：虚拟商品评价、2：实体商品评价）
     */
    private Integer evaluateSource;

    /**
     * 评价星级
     */
    private Integer evaluateLevel;

    /**
     * 描述相符
     */
    private String descriptionMatch;

    /**
     * 物流配送
     */
    private String logisticsDistribution;

    /**
     * 服务态度
     */
    private String serviceAttitude;

    /**
     * 文字评价
     */
    private String textEvaluate;

    /**
     * 图片/视频链接地址
     */
    private String fileUrl;

    /**
     * 评价时间
     */
    private Date evaluateTime;

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
