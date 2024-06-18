package com.cykj.contrellor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 旭
 * @Date: 2024/05/23 9:41
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserControllor {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
