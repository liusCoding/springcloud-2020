package com.liuscoding.springcloud.service.impl;

import com.liuscoding.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @className: MessageProviderImpl
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 12:33
 */

@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    private final MessageChannel output;

    public MessageProviderImpl(MessageChannel output) {
        this.output = output;
    }

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("****************serial:"+serial);
        return serial;
    }
}
