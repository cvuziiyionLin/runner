package com.yaohongjie.runner.web.controller;

import com.yaohongjie.runner.core.domain.Customer;
import com.yaohongjie.runner.core.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping(value = "/register")
    public Customer register(@RequestBody Customer customer) {
        return customerService.register(customer);
    }

}
