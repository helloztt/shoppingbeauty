package com.it.shopping.beauty.controller;

import com.it.shopping.beauty.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by helloztt on 2017/12/21.
 */
@Controller
public class TestController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "helloztt!" + userRepository.count();
    }
}
