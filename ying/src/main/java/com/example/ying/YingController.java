package com.example.ying;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YingController {
    @RequestMapping(value = "/second")
    public String second() {
        return "ying";
    }
}
