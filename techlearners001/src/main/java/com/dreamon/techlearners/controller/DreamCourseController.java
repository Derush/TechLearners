package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.StoreList;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.model.DreamCourse;
import com.dreamon.techlearners.repository.StoreListRepository;
import com.dreamon.techlearners.repository.UGCRepository;
import com.dreamon.techlearners.repository.eligibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class DreamCourseController {
    @Autowired
    eligibleRepository eligi;
    @Autowired
    UGCRepository cou;
    @Autowired
    StoreListRepository retrivelist;

    @RequestMapping("/DreamCourse")
    public String pageform(Model model)
    {
        return  "DreamCourse";
    }
    @RequestMapping(value="/Dream",method = RequestMethod.POST)
    public  String search(HttpServletRequest request, Model model)
    {
        String key= null;

        String course = request.getParameter("course");
        String subject1 = request.getParameter("subject1");
        String subject2 = request.getParameter("subject2");
        String subject3 = request.getParameter("subject3");
        StoreList sl = new StoreList();

        List<UGC_Course> newList = cou.findAll();
        boolean checking1 = false;


        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String coursename = newList.get(i).getName();

            if (coursename.equals(course)) {
                for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                    key = entry.getKey().toString();

                    {
                        System.out.println(key + " ");
                    }
                }
            }


        }

        return "favCourse";
    }
}
