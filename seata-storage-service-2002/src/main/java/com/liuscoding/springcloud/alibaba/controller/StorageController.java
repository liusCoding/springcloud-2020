package com.liuscoding.springcloud.alibaba.controller;

import com.liuscoding.springcloud.alibaba.domain.CommonResult;
import com.liuscoding.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: StorageController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-12 10:25
 */


@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
