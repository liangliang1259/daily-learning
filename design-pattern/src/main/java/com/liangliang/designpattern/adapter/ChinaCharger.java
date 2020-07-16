package com.liangliang.designpattern.adapter;

/**
 * @Description: 中国内地充电
 * @Author: sunliangliang
 * @Date: 2020/7/16
 */
public class ChinaCharger implements Charger{
    @Override
    public void charge() {
        System.out.println("使用大陆充电器给手机充电....");
    }
}
