package com.dreamon.techlearners.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class aboutController {

    @RequestMapping("/about")
    public String pageform(Model model) {
//        ugcRepository.findAll();
        return "about";
    }
}