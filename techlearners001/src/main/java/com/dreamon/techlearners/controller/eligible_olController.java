package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class eligible_olController {

    @RequestMapping("/eligible_ol")
    public String pageform(Model model) {
        return "eligible_ol";
    }

}