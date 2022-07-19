package com.example;

import org.jvnet.hk2.annotations.Service;

@Service
public class MyService {

    public String getServiceName() {
        return "MyService";
    }
}
