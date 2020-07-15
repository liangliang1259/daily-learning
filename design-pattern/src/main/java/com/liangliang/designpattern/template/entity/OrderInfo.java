package com.liangliang.designpattern.template.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @Description: 订单信息
 * @Author: sunliangliang
 * @Date: 2020/7/15
 */
@Data
@Builder
@AllArgsConstructor
public class OrderInfo {
    private Integer orderId;
    private Double price;
    private Integer status;
}
