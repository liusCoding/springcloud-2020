package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: PayMentApplication
 * @description:
 * @author: liusCoding
 * @create: 2020-06-03 23:06
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class,args);
    }
}
