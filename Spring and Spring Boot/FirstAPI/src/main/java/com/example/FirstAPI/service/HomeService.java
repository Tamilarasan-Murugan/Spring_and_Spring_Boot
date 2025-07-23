package com.example.FirstAPI.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String greet(){
        return "Hello Tamilarasan !";
    }

    public String about() {
        return "You are in about !";
    }
}
