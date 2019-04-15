package spring.study.startup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.study.startup.bean.SimpleBean;
import spring.study.startup.event.RegisterEvent;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private ApplicationContext context;

    @PostMapping("register")
    public String register(){
        context.publishEvent(new RegisterEvent(new SimpleBean("007", "测试监听器实例")));
        return "user register success";
    }
}
