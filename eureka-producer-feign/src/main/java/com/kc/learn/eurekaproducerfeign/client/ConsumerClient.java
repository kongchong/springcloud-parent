package com.kc.learn.eurekaproducerfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description:
 *
 * @author kongchong
 * date: 2019-07-18 11:33
 */
@FeignClient(value = "eureka-consumer", fallback = ConsumerClient.FallBack.class)
public interface ConsumerClient {

    @GetMapping("hi")
    String sayHi(@RequestParam("name") String name);

    @Component
    class FallBack implements ConsumerClient {

        @Override
        public String sayHi(String name) {
            return "sorry" + name;
        }
    }
}
