package com.example.FirstAPI.controller;

import com.example.FirstAPI.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HomeService service;
    @GetMapping()
    public String greet(){
        return service.greet();
    }

    @GetMapping("about")
    public String aboutUs(){
        return service.about();
    }
}
