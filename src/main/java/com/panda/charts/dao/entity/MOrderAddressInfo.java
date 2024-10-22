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
 * 订单-通用-收货地址表
 * </p>
 *
 * @author muxh
 * @since 2022-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_order_address_info")
public class MOrderAddressInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @PrimaryKey
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 售前订单号
     */
    private String orderNo;

    /**
     * 售后订单号
     */
    private String returnNo;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 地址类型：（1：收货人、2：联系人、3：商家）
     */
    private Integer addressType;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 收件人手机号
     */
    private String phone;

    /**
     * 收件人地址
     */
    private String address;

    /**
     * 所在省份id
     */
    private Integer provinceId;

    /**
     * 所在城市id
     */
    private Integer cityId;

    /**
     * 所在区id
     */
    private Integer regionId;

    /**
     * 所在乡镇id
     */
    private Integer townId;

    /**
     * 所在省份名称
     */
    private String provinceName;

    /**
     * 所在城市名称
     */
    private String cityName;

    /**
     * 所在区名称
     */
    private String regionName;

    /**
     * 经度
     */
    private String lng;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 定位地址
     */
    private String location;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否默认地址（0：否、1：是）
     */
    private Integer isDefault;

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
