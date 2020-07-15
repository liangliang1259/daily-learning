package com.liangliang.designpattern.template;

import com.liangliang.designpattern.template.entity.OrderInfo;

/**
 * @Description: 模板方法
 * @Author: sunliangliang
 * @Date: 2020/7/15
 */
public abstract class PayService {
    /**
     * 服务调用，不同的支付渠道，调用不同的接口
     */
    public abstract boolean rpcPay(OrderInfo orderInfo);
    //构造订单信息
    public abstract OrderInfo buildData();
    /**
     * 支付
     */
    public void pay(){
        //1.构造订单信息
        OrderInfo orderInfo = buildData();
        //2.调用支付接口
        boolean result = rpcPay(orderInfo);
        //3.更新数据
        if (result){
            paySuccess(orderInfo);
        }else {
            payFailed(orderInfo);
        }
    }
    /**
     * 支付成功后流程处理
     * @param orderInfo
     */
    protected abstract void payFailed(OrderInfo orderInfo);
    /**
     * 支付失败后流程处理
     * @param orderInfo
     */
    public abstract void paySuccess(OrderInfo orderInfo);
}
