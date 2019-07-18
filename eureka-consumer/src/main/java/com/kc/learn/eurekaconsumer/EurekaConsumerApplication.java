package com.kc.learn.eurekaconsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * eureka注册中心消费者实例
 *
 * @author kongchong
 * date: 2019-07-18 10:12
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("hi")
    public String sayHi(@RequestParam("name") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }


}
