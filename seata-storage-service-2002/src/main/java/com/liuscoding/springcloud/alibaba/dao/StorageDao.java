package com.liuscoding.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @className: StorageDao
 * @description:
 * @author: liusCoding
 * @create: 2020-06-12 10:20
 */

@Mapper
public interface StorageDao {

    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
