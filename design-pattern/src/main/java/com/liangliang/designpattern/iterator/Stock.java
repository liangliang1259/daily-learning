package com.liangliang.designpattern.iterator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 股票类
 * @Author: sunliangliang
 * @Date: 2020/7/15
 */
@Data
@Builder
@AllArgsConstructor
public class Stock {
    //股票代码
    private String code;
    //名称
    private String name;
    //价格
    private Double amount;
    //数量
    private Double price;
}
