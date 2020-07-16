package com.liangliang.designpattern.adapter;

/**
 * @Description: 适配器
 * @Author: sunliangliang
 * @Date: 2020/7/16
 */
public class Adapter implements Charger{
    Charger charger = null;

    public Adapter(Charger charger) {
        this.charger = charger;
    }
    @Override
    public void charge() {
        System.out.println("通过适配器.....");
        this.charger.charge();
    }
}
