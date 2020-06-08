package com.liuscoding.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @className: PaymentFallbackService
 * @description:
 * @author: liusCoding
 * @create: 2020-06-08 15:49
 */

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
           return "-----PaymentFallbackService fall back-paymentInfoOk ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfoTimeOut ,o(╥﹏╥)o";
    }
}
