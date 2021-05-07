package com.yaohongjie.runner.core.service.impl;

import com.yaohongjie.runner.core.domain.Customer;
import com.yaohongjie.runner.core.repository.CustomerRepository;
import com.yaohongjie.runner.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer register(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer login(String username, String password) {
        return repository.findByUsernameAndPassword(username, password);
    }

    @Override
    public Page<Customer> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Customer get(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Customer modify(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer applyToDistributor(Long id) {
        Customer customer = repository.findOne(id);
        customer.setApplyStatus(1);
        return repository.save(customer);
    }

    @Override
    public Boolean confirmToDistributor(Long id, Integer status) throws Exception {

        Customer customer = repository.findOne(id);
        if(status == 2){    //表示申请成功
            customer.setApplyStatus(status);
            customer.setType(2);
            return true;
        }else if(status == 9){  //表示申请失败
            customer.setApplyStatus(status);
            return false;
        }else{
            throw new Exception("参数有误!!!");
        }
    }
}
