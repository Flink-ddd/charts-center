package com.panda.charts.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author muxiaohui
 */
@Data
@ApiModel(description = "各品牌总销量与总金额返回信息")
public class OrderBrandRespDTO {
    @ApiModelProperty("品牌名称")
    private String brandName;
    @ApiModelProperty("总销量")
    private Integer brandSalesVolume;
    @ApiModelProperty("总金额")
    private BigDecimal brandTotalAmount;


}
