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
 * 售后退/换货信息表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_return_goods")
public class MOrderReturnGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 售后服务单号
     */
    private String returnNo;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 原商品id
     */
    private Long goodsId;

    /**
     * 商品种类： 1：课程，2：图书，3：1v1，4：课程包，5：辅导产品
     */
    private Integer goodsClass;

    /**
     * 原商品图片
     */
    private String goodsImgUrl;

    /**
     * 原商品名称
     */
    private String goodsName;

    /**
     * 原商品规格信息
     */
    private String goodsSku;

    /**
     * 原商品单价
     */
    private String goodsPrice;

    /**
     * 原商品数量
     */
    private Integer purchaseNum;

    /**
     * 换货商品数量
     */
    private Integer exchangeGoodsNum;

    /**
     * 换货商品id
     */
    private String exchangeGoodsId;

    /**
     * 换货商品名称
     */
    private String exchangeGoodsName;

    /**
     * 换货商品规格信息
     */
    private String exchangeGoodsSku;

    /**
     * 换货商品单价
     */
    private BigDecimal exchangeGoodsPrice;

    /**
     * 换货商品图片
     */
    private String exchangeGoodsImage;

    /**
     * 售后商品数量
     */
    private Integer applyNum;

    /**
     * 申请退款金额
     */
    private BigDecimal applyMoney;

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
