package com.liuscoding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @className: ConfigServerApplication3344
 * @description:
 * @author: liusCoding
 * @create: 2020-06-09 11:20
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication3344.class,args);
    }
}
