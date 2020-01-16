package com.hnanet._5_evntListener.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserRegisterController {
    @Autowired
    private UserRegisterService userRegisterService;

    public void register(User user) {
        //进行注册
        userRegisterService.register(user);
        System.out.println("UserRegisterController#register [controller]注册用户成功！");
    }
}