package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class indexController {


    @RequestMapping("/")
    public String mainIndex(Map<String, Object> model) {
//        model.put("message", this.message);
        return "Home";
    }

    @RequestMapping("/index")
    public String index(Map<String, Object> model) {
//        model.put("message", this.message);
        return "fragments/index";
    }

    @RequestMapping("/header")
    public String header(Map<String, Object> model) {
//        model.put("message", this.message);
        return "fragments/header";
    }
}
