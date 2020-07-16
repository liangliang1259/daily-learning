package com.liangliang.designpattern.adapter;

/**
 * @Description: 日本充电
 * @Author: sunliangliang
 * @Date: 2020/7/16
 */
public class JapanCharger implements Charger{
    @Override
    public void charge() {
        System.out.println("使用日本充电器给手机充电....");
    }
}
