package com.liuscoding.springcloud.controller;


import com.liuscoding.springcloud.entity.Payment;
import com.liuscoding.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @className: OrderController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 11:53
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {

    private final RestTemplate restTemplate;

    public static String PAYMENT_URL = "http://localhost:8001";

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }

    @RequestMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
