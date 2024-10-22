package com.panda.charts.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.panda.charts.common.PrimaryKey;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 订单-购物车表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MOrderShopCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @JsonSerialize(using = ToStringSerializer.class)
    @PrimaryKey
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 商家ID
     */
    private Long businessId;

    /**
     * 区域ID
     */
    private String areaId;

    /**
     * 区域价ID
     */
    private String specId;

    @ApiModelProperty("商品类型：1--课程，2--图书，3--1v1, 4--课程包,5--辅导产品")
    private Integer goodsClass;

    /**
     * 商品编码
     */
    private String goodsNo;

    /**
     * 商品类型（1：实物、2：虚拟）
     */
    private Integer goodsType;

    /**
     * 商品类型（1：职场、2：办公、3：其他）
     */
    private Integer goodsClassification;

    /**
     * 商品价格
     */
    private String goodsPrice;

    /**
     * 购买数量
     */
    private Integer purchaseNum;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品/药品图片地址，多张图片以;号隔开。
     */
    private String productImgUrl;

    /**
     * 规格名称
     */
    private String specName;

    /**
     * 规格价格
     */
    private String specPrice;

    /**
     * 商家名称
     */
    private String businessName;

    /**
     * 备注
     */
    private String remark;

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
