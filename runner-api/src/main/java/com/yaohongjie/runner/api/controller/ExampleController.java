package com.yaohongjie.runner.api.controller;


import com.yaohongjie.runner.api.utils.ResultGenerator;
import com.yaohongjie.runner.api.vo.Result;
import com.yaohongjie.runner.core.domain.Example;
import com.yaohongjie.runner.core.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    //新增操作
    @PostMapping("/save")
    public Result save(@RequestParam String title, @RequestParam String remark){
        Example example = new Example();
        example.setTitle(title);
        example.setRemark(remark);

        Example result = exampleService.save(example);
        return ResultGenerator.ok(result);
    }

    //查询操作
    //http://localhost:8088/api/example/{id}
    @GetMapping("/{id}")
    public Result get(@PathVariable Long id){
        return ResultGenerator.ok(exampleService.findById(id));
    }
}
