package com.liangliang.designpattern.template.impl;

import com.liangliang.designpattern.template.PayService;
import com.liangliang.designpattern.template.entity.Constants;
import com.liangliang.designpattern.template.entity.OrderInfo;

/**
 * @Description: 微信支付
 * @Author: sunliangliang
 * @Date: 2020/7/15
 */
public class WechatPayServiceImpl extends PayService {
    @Override
    public boolean rpcPay(OrderInfo orderInfo) {
        System.out.println("调用微信进行支付，支付成功.....");
        return true;
    }

    @Override
    public OrderInfo buildData() {
        System.out.println("微信构造订单实体类....");
        OrderInfo orderInfo = OrderInfo.builder()
                .orderId(1)
                .price(2.1)
                .status(Constants.Unpaid)
                .build();
        return orderInfo;
    }

    @Override
    protected void payFailed(OrderInfo orderInfo) {
        orderInfo.setStatus(Constants.pay_failed);
        System.out.println("微信支付失败，等待后续处理");
    }

    @Override
    public void paySuccess(OrderInfo orderInfo) {
        orderInfo.setStatus(Constants.pay_success);
        System.out.println("微信支付成功，待后续处理");
    }
}
