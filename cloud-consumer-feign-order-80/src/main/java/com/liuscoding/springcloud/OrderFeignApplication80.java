package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @className: com.liuscoding.springcloud.OrderFeignApplication80
 * @description:
 * @author: liusCoding
 * @create: 2020-06-05 14:30
 */

@SpringBootApplication
@EnableFeignClients
public class OrderFeignApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApplication80.class,args);
    }
}
