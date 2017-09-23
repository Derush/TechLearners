package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.repository.UGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class EligibleController {

    @Autowired
    UGCRepository ugcRepository;

    @RequestMapping("/eligible")
    public  String pageform(Model model)
    {
        ugcRepository.findAll();
        return "eligible";
    }
    @RequestMapping(value = "/addZscore", method = RequestMethod.POST)
    public String addCar(@ModelAttribute ZSCORE z) {
        ZscoreRepository.save(z);
        return "redirect:Zscore";
    }




}
