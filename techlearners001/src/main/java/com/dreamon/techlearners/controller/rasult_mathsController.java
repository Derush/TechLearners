package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller


public class rasult_mathsController {

    @RequestMapping("/result_maths")
    public String page(Map<String, Object> model) {
//        model.put("message", this.message);
        return "result_maths";
    }
}
