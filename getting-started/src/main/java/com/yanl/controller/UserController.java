package com.yanl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: YanL
 * @Time: 4:54 PM 1/7/20
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回字符串
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("sayHello方法执行了...");
        return "success";
    }
}
