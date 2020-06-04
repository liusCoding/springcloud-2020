package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: OrderZkApplication80
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 21:20
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication80.class,args);
    }
}
