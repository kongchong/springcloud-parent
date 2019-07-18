package com.kc.learn.eurekaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 *
 * @author kongchong
 * date: 2019-07-18 10:51
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-consumer/hi?name=" + name, String.class);
    }
}
