package com.yaohongjie.runner.core.service.impl;

import com.yaohongjie.runner.core.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "Hello, " + name;
    }
}

