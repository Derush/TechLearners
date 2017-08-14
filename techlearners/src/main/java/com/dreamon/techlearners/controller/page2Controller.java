package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class page2Controller {

    @RequestMapping("/page2")
    public String page2(Map<String, Object> model) {
//        model.put("message", this.message);
        return "page2";
    }


}
