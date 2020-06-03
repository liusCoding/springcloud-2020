package com.liuscoding.springcloud.service;

import com.liuscoding.springcloud.entity.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById( Long id);
}
