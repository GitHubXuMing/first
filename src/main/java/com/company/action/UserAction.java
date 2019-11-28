package com.company.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAction {

    @RequestMapping("test.do")
    public String test(){
        return "test";
    }
}
