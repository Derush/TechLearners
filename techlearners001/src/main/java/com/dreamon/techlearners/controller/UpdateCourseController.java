package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.UniCourse;
import com.dreamon.techlearners.model.uniDetails;
import com.dreamon.techlearners.repository.UniCourseDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UpdateCourseController {
    @Autowired
    UniCourseDetailsRepository uniDet;

    @RequestMapping("/updateCourse")
    public String adminPanel(Model model)
    {
        model.addAttribute("show" , uniDet.findAll());
        return  "updateCourse";
    }

    @RequestMapping(value = "/upadteCourseDetails" , method = RequestMethod.POST)
    public String upadetDetails(Model model, HttpServletRequest request)
    {
        String uniId = request.getParameter("uniId");
        String courseName =request.getParameter("courseName");
        String uniName = request.getParameter("uniName").toUpperCase();


        UniCourse uni = new UniCourse();
        uni.setUniCode(uniId);
        uni.setCourseName(courseName);
        uni.setUnviersityName(uniName);

        uniDet.save(uni);
        model.addAttribute("show" , uniDet.findAll());
        return "updateCourse";
    }
}
