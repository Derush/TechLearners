package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class minimum_reqController {

    @RequestMapping("/minimum_req")
    public String pageform(Model model) {
        return "minimum_req";
    }

}