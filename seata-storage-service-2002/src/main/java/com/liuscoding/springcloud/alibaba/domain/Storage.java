package com.liuscoding.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @className: Storage
 * @description:
 * @author: liusCoding
 * @create: 2020-06-12 10:21
 */


@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
