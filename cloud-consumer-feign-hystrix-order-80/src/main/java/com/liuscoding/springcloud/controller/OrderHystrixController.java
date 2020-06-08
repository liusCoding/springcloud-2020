package com.liuscoding.springcloud.controller;

import com.liuscoding.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: OrderHystrixController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-08 14:21
 */

@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderHystrixController {

    private final PaymentHystrixService paymentHystrixService;

    public OrderHystrixController(PaymentHystrixService paymentHystrixService) {
        this.paymentHystrixService = paymentHystrixService;
    }


    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfoOk(id);

        return result;
    }

    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfoTimeOut(id);
        return result;
    }
}
