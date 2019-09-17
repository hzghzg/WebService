package com.myservice.helloservice.impl;

import com.myservice.helloservice.HelloService;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+" say hello to you!";
    }
}
