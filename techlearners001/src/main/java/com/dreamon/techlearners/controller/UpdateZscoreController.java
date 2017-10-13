package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.UGC_Zscore;
import com.dreamon.techlearners.model.UniCourse;
import com.dreamon.techlearners.repository.UGC_ZscoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class UpdateZscoreController {
    @Autowired
    UGC_ZscoreRepository zscore;

    @RequestMapping("/updateZscore")
    public String adminPanel(Model model)
    {
        Map<String,Float> newMap=null;
        List<UGC_Zscore> list1= zscore.findAll();
        for (int i = 0; i < list1.size(); i++) {
            newMap = list1.get(i).getZscore();
            model.addAttribute("show", zscore.findAll());
            model.addAttribute("eli", list1.get(i).getZscore());
        }



        return  "updateZscore";

    }

    @RequestMapping(value = "/upadteZscoreDetails" , method = RequestMethod.POST)
    public String upadetDetails(Model model, HttpServletRequest request)
    {


        String uniId = request.getParameter("uniId");
        String courseName =request.getParameter("courseName");
        String uniName = request.getParameter("uniName").toUpperCase();
        Integer year = Integer.valueOf(request.getParameter("uniName"));


        UGC_Zscore uni = new UGC_Zscore();
        uni.setId(uniId);
        uni.setName(courseName);
        uni.setUniversity(uniName);
        uni.setYear(year);


        List<UGC_Zscore> list1= zscore.findAll();
        for (int i = 0; i < list1.size(); i++) {
            model.addAttribute("show", zscore.findAll());
            model.addAttribute("eli", list1.get(i).getZscore());
        }
        return "updateZscore";
    }
}
