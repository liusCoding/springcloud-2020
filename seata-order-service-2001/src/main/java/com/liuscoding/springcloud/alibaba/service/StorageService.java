package com.liuscoding.springcloud.alibaba.service;

import com.liuscoding.springcloud.alibaba.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @className: StorageService
 * @description:
 * @author: liusCoding
 * @create: 2020-06-12 10:26
 */

@FeignClient(value = "seata-storage-service")
public interface StorageService
{
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
