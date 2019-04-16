package com.yangqingmang.springcloud.consumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("EUREKA-CLIENT")
public interface HelloService {
    @GetMapping("hello/sayHello")
    String sayHello();
}
