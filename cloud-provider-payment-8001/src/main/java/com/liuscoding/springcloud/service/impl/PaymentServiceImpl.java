package com.liuscoding.springcloud.service.impl;

import com.liuscoding.springcloud.dao.PaymentDao;
import com.liuscoding.springcloud.entity.Payment;
import com.liuscoding.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @className: PaymentServiceImpl
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 00:23
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    private final  PaymentDao paymentDao;

    public PaymentServiceImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
