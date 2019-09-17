package com.client;

import com.myservice.helloservice.impl.HelloServiceImpl;
import com.myservice.helloservice.impl.HelloServiceImplService;

public class Main {
    public static void main(String[] args) {
        HelloServiceImplService helloServiceImplService = new HelloServiceImplService();
        HelloServiceImpl port = helloServiceImplService.getPort(HelloServiceImpl.class);
        String response = port.sayHello("Daryl");
        System.out.println(response);
    }
}
