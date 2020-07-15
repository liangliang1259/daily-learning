package com.liangliang.designpattern.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 没有使用迭代器的设计模式
 * @Author: sunliangliang
 * @Date: 2020/7/15
 * 使用于访问对象(集合)内容而不关注其内部实现，并且不关注其内部编号
 * 支持多次遍历
 */
public class NonIteratorPattern {
    private static Map<String,Stock> stockHashMap = new HashMap<>();

    public static void main(String[] args) {
        Stock stock1 = new Stock("JD","京东",242.6,100.2);
        Stock stock2 = new Stock("TX","腾讯",500.2,210.2);
        Stock stock3 = new Stock("BABA","阿里巴巴",480.2,540.8);
        stockHashMap.put(stock1.getCode(),stock1);
        stockHashMap.put(stock2.getCode(),stock2);
        stockHashMap.put(stock3.getCode(),stock3);

        for (String code:stockHashMap.keySet()){
            System.out.println(stockHashMap.get(code).toString());
        }
    }
}
