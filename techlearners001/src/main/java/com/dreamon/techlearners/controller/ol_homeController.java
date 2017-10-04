package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ol_homeController {
    @RequestMapping("/ol_home")
    public String pageform(Model model) {
        return "ol_home";
    }

}
