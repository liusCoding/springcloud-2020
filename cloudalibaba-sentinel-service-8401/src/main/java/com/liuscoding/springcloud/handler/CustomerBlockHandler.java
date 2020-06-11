package com.liuscoding.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.liuscoding.springcloud.vo.CommonResult;

/**
 * @className: CustomerBlockHandler
 * @description:
 * @author: liusCoding
 * @create: 2020-06-11 13:53
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
