package com.yaohongjie.runner.core.service.impl;

import com.yaohongjie.runner.core.domain.Manager;
import com.yaohongjie.runner.core.repository.ManagerRepository;
import com.yaohongjie.runner.core.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepository repository;


    @Override
    public Manager login(String userName, String password) {
        return repository.findByUsernameAndPassword(userName, password);
    }

    @Override
    public Manager get(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Manager modify(Manager manager) {
        return repository.save(manager);
    }
}
