package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: ConfigClientApplication3366
 * @description:
 * @author: liusCoding
 * @create: 2020-06-09 17:12
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3366.class,args);
    }
}
