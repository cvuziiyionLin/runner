package com.yaohongjie.runner.web.controller;

import com.yaohongjie.runner.core.domain.Customer;
import com.yaohongjie.runner.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 公开的控制器，所有不需要身份认证的方法都会放到这个控制器中
 */
@Controller
@RequestMapping("/publiz")
public class PublizController {

    @Autowired
    public CustomerService customerService;

    //进入注册页面
    @GetMapping("/register")
    public String register() {
        return "publiz/register";
    }

    //执行注册操作
    @PostMapping("register")
    public String register(@RequestParam String username,
                           @RequestParam String nickname,
                           @RequestParam String password,
                           @RequestParam String mobile,
                           Model model) {
        Customer customer = new Customer(username, nickname, password, mobile);
        Customer result = customerService.register(customer);
        if (result != null) {
            //注册成功,跳转到登录界面，并携带相关提示信息
            model.addAttribute("msg");
            return "publiz/regsuccess";
        } else {
            //注册失败
            return null;
        }

    }

    //进入登录页面
    @GetMapping("/login")
    public String login() {
        return "publiz/login";
    }

    //执行登录操作
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session, Model model) {
        Customer customer = customerService.login(username, password);
        if (customer == null) {
            //登录失败,重新跳转到登录界面，并给出相关提示
            model.addAttribute("errorMsg", "用户名或密码错误");
            return "publiz/login";
        } else {
            //登录成功
            //将用户信息存放到session
            session.setAttribute("customer", customer);
            //重定向到下单界面
            return "redirect:/order/index";
        }
    }
}
