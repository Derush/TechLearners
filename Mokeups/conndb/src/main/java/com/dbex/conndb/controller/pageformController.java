package com.dbex.conndb.controller;

import com.dbex.conndb.repository.UGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageformController {

    @Autowired
    UGCRepository ugcRepository;

    @RequestMapping("/pageform")
    public  String pageform(Model model)
    {
        ugcRepository.findAll();
        return "pageform";
    }
}
