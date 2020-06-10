package com.liuscoding.springcloud.controller;

import com.liuscoding.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: SendMessageController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 12:37
 */

@RestController
public class SendMessageController {
    private final IMessageProvider messageProvider;


    public SendMessageController(IMessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
