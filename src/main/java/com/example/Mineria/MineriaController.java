package com.example.Mineria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MineriaController {

    @RequestMapping("/")
    public String home(){
        return "Hello World, with Load Balancer";
    }
}
