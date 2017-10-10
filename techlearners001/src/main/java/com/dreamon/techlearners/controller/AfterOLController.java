package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AfterOLController {
    @RequestMapping("/AfterOL")
    public String pageform(Model model) {
//        ugcRepository.findAll();
        return "AfterOL";
    }

}
