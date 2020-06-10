package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: PaymentApplication9003
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 16:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9003.class, args);
    }
}
