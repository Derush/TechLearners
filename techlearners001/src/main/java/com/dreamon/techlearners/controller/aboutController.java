package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aboutController {

    @RequestMapping("/about")
    public String about1(Model model) {
//        ugcRepository.findAll();
        return "about";
    }
}