package com.ept.campusEvents.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api") 
public class SimpleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
    

}
