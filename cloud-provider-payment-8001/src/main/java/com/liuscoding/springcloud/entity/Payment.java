package com.liuscoding.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @className: Payment
 * @description:
 * @author: liusCoding
 * @create: 2020-06-03 23:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment implements Serializable {
    private Long id ;

    private String serial;
}
