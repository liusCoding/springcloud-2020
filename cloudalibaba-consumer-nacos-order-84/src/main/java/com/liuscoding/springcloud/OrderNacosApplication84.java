package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: OrderNacosApplication84
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 17:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosApplication84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication84.class,args);
    }
}
