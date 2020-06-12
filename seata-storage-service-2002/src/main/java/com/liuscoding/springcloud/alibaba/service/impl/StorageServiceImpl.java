package com.liuscoding.springcloud.alibaba.service.impl;

import com.liuscoding.springcloud.alibaba.dao.StorageDao;
import com.liuscoding.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className: StorageServiceImpl
 * @description:
 * @author: liusCoding
 * @create: 2020-06-12 10:25
 */

@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
