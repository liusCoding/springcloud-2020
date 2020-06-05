package com.liuscoding.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MySelfRule
 * @description:
 * @author: liusCoding
 * @create: 2020-06-05 12:53
 */

@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {   //定义为随机
        return new RandomRule();
    }
}
