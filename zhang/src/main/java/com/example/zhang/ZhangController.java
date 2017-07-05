package com.example.zhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@EnableAutoConfiguration
@RestController
public class ZhangController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/first")
    public String first() {
        return "zhang"+new RestTemplate().getForObject("http://localhost:5555/ying/second", String.class);
    }

}
