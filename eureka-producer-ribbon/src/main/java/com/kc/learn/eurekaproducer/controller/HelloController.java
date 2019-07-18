package com.kc.learn.eurekaproducer.controller;

import com.kc.learn.eurekaproducer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author kongchong
 * date: 2019-07-18 10:54
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("hi")
    public String sayHi(@RequestParam("name") String name) {
        return helloService.hiService(name);
    }

}
