package com.liuscoding.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ConfigClientController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-09 12:21
 */

@RestController
@RefreshScope
public class ConfigClientController
{
    @Value("${server.port}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return configInfo;
    }
}
