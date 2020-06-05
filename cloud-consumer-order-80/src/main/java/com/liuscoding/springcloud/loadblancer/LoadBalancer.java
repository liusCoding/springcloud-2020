package com.liuscoding.springcloud.loadblancer;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author liuscoding
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
