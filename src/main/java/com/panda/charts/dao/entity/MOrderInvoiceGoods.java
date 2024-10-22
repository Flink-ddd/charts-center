package com.panda.charts.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.panda.charts.common.PrimaryKey;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单-发票-商品信息表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_invoice_goods")
public class MOrderInvoiceGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    private Long id;

    /**
     * 发票ID
     */
    private Long invoiceId;

    /**
     * 主订单编号
     */
    private String mainOrderNo;

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
    private Long goodsId;

    /**
     * 商品种类： 1：课程，2：图书，3：1v1，4：课程包，5：辅导产品
     */
    private Integer goodsClass;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 开具发票的数量
     */
    private Integer invocedNum;

    /**
     * 商品价格
     */
    private String goodsPrice;

    /**
     * 商品总价(数量×单价)
     */
    private BigDecimal totalPrice;

    /**
     * 备注
     */
    private String remark;

    /**
     * 商品规格
     */
    private String goodsSpecifications;

    /**
     * 商品单位
     */
    private String goodsUnit;

    /**
     * 税收分类编码
     */
    private String taxClassificationCode;

    /**
     * 享受税收优惠政策内容
     */
    private String preferentialTaxPolicies;

    /**
     * 是否享受税收优惠政策：0，是；1，否
     */
    private Integer preferentialTaxCode;

    /**
     * 含税标志0，是；1，否
     */
    private Integer taxIncludedSigns;

    /**
     * 税率
     */
    private String rate;

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
