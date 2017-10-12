package com.dreamon.techlearners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class updateCourse {
    @RequestMapping("/updateCourse")
    public String adminPanel(Model model)
    {
        return  "updateCourse";
    }
}
