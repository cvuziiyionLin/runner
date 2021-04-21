package com.yaohongjie.runner.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yaohongjie.runner")
public class RunnerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunnerApiApplication.class,args);
    }
}

