package com.myservice;

import com.myservice.helloservice.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8999/myService",new HelloServiceImpl());
        System.out.println("发布成功！");
    }
}
