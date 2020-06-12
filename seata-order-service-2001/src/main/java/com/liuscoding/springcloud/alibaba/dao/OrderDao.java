package com.liuscoding.springcloud.alibaba.dao;

import com.liuscoding.springcloud.alibaba.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态 ，从0改到1
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
