package edu.nf.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LWP
 * @date 2020/3/25
 */
@RestController
public class Demo {

    @GetMapping("/test")
    public String test(){
        return "hello word!";
    }
}