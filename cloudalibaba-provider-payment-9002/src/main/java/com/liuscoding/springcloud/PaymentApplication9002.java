package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: PaymentApplication9002
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 16:40
 */

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9002.class,args);
    }
}
