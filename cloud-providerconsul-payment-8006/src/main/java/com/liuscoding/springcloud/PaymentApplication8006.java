package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: PaymentApplication8006
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 22:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8006.class,args);
    }
}
