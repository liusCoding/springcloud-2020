package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: StreamMQApplication8802
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 13:35
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQApplication8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQApplication8802.class,args);
    }
}
