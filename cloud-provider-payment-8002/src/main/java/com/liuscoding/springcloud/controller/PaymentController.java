package com.liuscoding.springcloud.controller;

import com.liuscoding.springcloud.entity.Payment;
import com.liuscoding.springcloud.service.PaymentService;
import com.liuscoding.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @className: PaymentController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 00:26
 */

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);

        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败,serverPort: "+serverPort,null);
        }
    }


    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null)
        {
            return new CommonResult(200,"查询成功,serverPort: "+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }

    @GetMapping(value = "/lb")
    public String getPaymentLB() {
        return serverPort;
    }

}
