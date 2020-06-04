package com.liuscoding.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @className: PaymentController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 22:33
 */

@RestController
@Slf4j
@RequestMapping(value = "/payment")
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/consul")
    public String paymentConsul()
    {
        return "springcloud with consul: "+serverPort+"\t   "+ UUID.randomUUID().toString();
    }
}
