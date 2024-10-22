package com.panda.charts.common;

import lombok.Data;

/**
 * @author muxiaohui
 */
@Data
public class RepBean {
    private String name;
    private Object value;

    public RepBean(){}

    public RepBean(String name, Object value){
        this.name = name;
        this.value = value;
    }
}
