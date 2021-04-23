package com.yaohongjie.runner.core.service.impl;


import com.yaohongjie.runner.core.domain.Example;
import com.yaohongjie.runner.core.repository.ExampleRepository;
import com.yaohongjie.runner.core.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    @Override
    public Example save(Example example) {
        return exampleRepository.save(example);
    }

    @Override
    public Example findById(Long id) {
        return exampleRepository.findOne(id);
    }
}