package com.liuscoding.springcloud.service.impl;

import com.liuscoding.springcloud.entity.Payment;
import com.liuscoding.springcloud.service.PaymentService;
import com.liuscoding.springcloud.vo.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @className: PyamentFallbackService
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 17:33
 */

@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
