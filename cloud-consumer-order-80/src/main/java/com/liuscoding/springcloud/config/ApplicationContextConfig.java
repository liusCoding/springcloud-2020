package com.liuscoding.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @className: ApplicationContextConfig
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 11:57
 */
@Configuration
public class ApplicationContextConfig {

    @Bean("restTemplate")
//    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
