package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.repository.StoreListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowCoursesController {
    @Autowired
    StoreListRepository retrivelist;

    @RequestMapping("/showCourses")
    public String coursesShow(Model model) {
        model.addAttribute("show", retrivelist.findAll());

        return "showCourses";
    }


}
