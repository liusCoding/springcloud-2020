package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: PaymentApplication9004
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 16:53
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9004.class,args);
    }
}
