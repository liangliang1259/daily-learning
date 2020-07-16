package com.liangliang.design;

import com.liangliang.designpattern.adapter.Adapter;

import com.liangliang.designpattern.adapter.Charger;
import com.liangliang.designpattern.adapter.ChinaCharger;
import com.liangliang.designpattern.adapter.JapanCharger;
import org.junit.Test;

/**
 * @Description: TODO
 * @Author: sunliangliang
 * @Date: 2020/7/16
 */
public class AdapterTest {
    @Test
    public void test(){
        Charger china = new ChinaCharger();
        Charger japan = new JapanCharger();
        Adapter adapter1 = new Adapter(china);
        adapter1.charge();
        Adapter adapter2 = new Adapter(japan);
        adapter2.charge();
    }
}
