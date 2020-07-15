package com.liangliang.designpattern.template;

import com.liangliang.designpattern.template.impl.AliPayServiceImpl;
import com.liangliang.designpattern.template.impl.WechatPayServiceImpl;

/**
 * @Description: 支付单侧
 * @Author: sunliangliang
 * @Date: 2020/7/15
 */
public class PayServiceTest {

    public static void main(String[] args) {
        PayService payService = new AliPayServiceImpl();
        payService.pay();

        PayService we = new WechatPayServiceImpl();
        we.pay();
    }

}
