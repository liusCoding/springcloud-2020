package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: OrderNacosApplication80
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 17:19
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication80.class,args);
    }
}
