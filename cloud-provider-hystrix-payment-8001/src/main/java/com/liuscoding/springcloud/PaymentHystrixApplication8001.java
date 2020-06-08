package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: PaymentHystrixApplication8001
 * @description:
 * @author: liusCoding
 * @create: 2020-06-08 10:18
 */
@SpringBootApplication
@EnableEurekaClient
//服务降级
@EnableCircuitBreaker
public class PaymentHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class,args);
    }
}
