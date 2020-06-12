package com.liuscoding.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @className: SeataStorageApplication2002
 * @description:
 * @author: liusCoding
 * @create: 2020-06-12 10:17
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
public class SeataStorageApplication2002
{
    public static void main(String[] args)
    {
        SpringApplication.run(SeataStorageApplication2002.class, args);
    }
}
