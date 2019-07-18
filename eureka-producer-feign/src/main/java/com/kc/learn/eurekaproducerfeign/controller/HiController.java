package com.kc.learn.eurekaproducerfeign.controller;

import com.kc.learn.eurekaproducerfeign.client.ConsumerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author kongchong
 * date: 2019-07-18 11:32
 */
@RestController
@RequiredArgsConstructor
public class HiController {

    private final ConsumerClient consumerClient;

    @GetMapping("hi")
    public String sayHi(@RequestParam("name") String name) {
        return consumerClient.sayHi(name);
    }
}
