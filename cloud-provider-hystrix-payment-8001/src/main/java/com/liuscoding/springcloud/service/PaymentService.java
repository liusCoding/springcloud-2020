package com.liuscoding.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @className: PaymentService
 * @description:
 * @author: liusCoding
 * @create: 2020-06-08 10:28
 */
@Service
public class PaymentService {
    static  AtomicInteger count = new AtomicInteger(0);
    public String paymentInfoOK(Integer id){
        return "线程池： " + Thread.currentThread().getName() +"\t"+ "paymentInfoOK(),id:"+ id+ "\t" +" \"O(∩_∩) 成功返回哈哈哈";
    }


    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler",commandProperties = {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")})
    public String paymentInfoTimeOut(Integer id){

        System.out.println("第"+count.getAndIncrement()+"请求");
        Integer timeOutNumber = 5;
       // int age  = 10/0;
        try {
            TimeUnit.SECONDS.sleep(timeOutNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池:  "+Thread.currentThread().getName()+" id:  "+id+"\t"+"O(∩_∩)O哈哈~"+"  耗时(秒): "+timeOutNumber;
    }

    public String paymentInfoTimeOutHandler(Integer id)
    {
        return "线程池:  "+Thread.currentThread().getName()+"  8001系统繁忙或者运行报错，请稍后再试,id:  "+id+"\t"+"o(╥﹏╥)o";
    }

}
