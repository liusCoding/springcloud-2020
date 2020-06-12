package com.liuscoding.springcloud.alibaba.confg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MybatisConfig
 * @description:
 * @author: liusCoding
 * @create: 2020-06-12 09:19
 */

@Configuration
@MapperScan("com.liuscoding.springcloud.alibaba.dao")
public class MybatisConfig {
}
