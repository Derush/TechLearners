package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.uniDetails;
import com.dreamon.techlearners.repository.uniDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UpdateUniController {

    @Autowired
    uniDetailsRepository uniDet;

    @RequestMapping("/updateUni")
    public String adminPanel(Model model) {

        model.addAttribute("show" , uniDet.findAll());
        return "updateUni";
    }
    @RequestMapping(value = "/upadteUniDetails" , method = RequestMethod.POST)
    public String upadetDetails(Model model, HttpServletRequest request)
    {
        String uniId = request.getParameter("uniId");
        String uniName = request.getParameter("uniName").toUpperCase();

        uniDetails uni = new uniDetails();
        uni.setUniversityId(uniId);
        uni.setUnviersityName(uniName);

        uniDet.save(uni);
        model.addAttribute("show" , uniDet.findAll());
        return "updateUni";
    }
}
