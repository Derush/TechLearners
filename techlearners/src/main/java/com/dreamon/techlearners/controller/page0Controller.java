package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.repository.UGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class page0Controller {

    @Autowired
    UGCRepository ugcRepository;

    @RequestMapping("/page0")
    public  String pageform(Model model)
    {
        ugcRepository.findAll();
        return "page0";
    }



}
