package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.StoreList;
import com.dreamon.techlearners.model.UGC_Course;
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
public class selectStreamController {
    @Autowired
    eligibleRepository eligi;
    @Autowired
    UGCRepository course;
    @Autowired
    StoreListRepository retrivelist;
    @RequestMapping("/selectStream")
    public String coursesShow(Model model) {

        return "selectStream";
    }


    @RequestMapping(name = "/arts", value = "/arts", method = RequestMethod.POST)
    public String check1(HttpServletRequest request, Model model) {

       // retrivelist.deleteAll();

        String subject51 = request.getParameter("subject51");
        String subject52 = request.getParameter("subject52");
        String subject53 = request.getParameter("subject53");
        Integer subject1R = Integer.valueOf(request.getParameter("subject1R"));
        Integer subject2R = Integer.valueOf(request.getParameter("subject2R"));
        Integer subject3R = Integer.valueOf(request.getParameter("subject3R"));
        StoreList sl = new StoreList();
        List<UGC_Course> newList = course.findAll();

        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String coursename = newList.get(i).getName();
            String university = newList.get(i).getUniversity();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

            for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                String key = entry.getKey().toString();
                Integer value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(subject51)) && (value <= subject1R)) {
                    check1 = true;
                }

                if ((key.equals(subject52)) && (value <= subject2R)) {
                    check2 = true;
                }

                if ((key.equals(subject53)) && (value <= subject3R)) {
                    check3 = true;
                }


            }
            if (check1 == true && check2 == true && check3 == true) {
                sl.setId(String.valueOf(cou));
                sl.setName(coursename);
                sl.setUniversity(university);
                retrivelist.save(sl);
                cou++;

            } else
                System.out.println("no subject there to choose");
        }
        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";
    }
}

