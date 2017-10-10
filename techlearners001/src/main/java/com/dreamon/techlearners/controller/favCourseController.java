package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.StoreList;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.repository.StoreListRepository;
import com.dreamon.techlearners.repository.UGCRepository;
import com.dreamon.techlearners.repository.eligibleRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class favCourseController {
    @Autowired
    eligibleRepository eligi;
    @Autowired
    UGCRepository course;
    @Autowired
    StoreListRepository retrivelist;

    @Autowired
    @RequestMapping("/favCourse")
    public String pageform(Model model) {
//        optionRepository.findAll();
        return "favCourse";
    }

    @RequestMapping(value = "/selectphisical", method = RequestMethod.POST)
    public String addSubject1(HttpServletRequest request, Model model) {

        retrivelist.deleteAll();

        String subject1 = request.getParameter("subject1");
        String subject2 = request.getParameter("subject2");
        String subject3 = request.getParameter("subject3");
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
                if (key.equals(subject1)) {
                    check1 = true;
                }

                if (key.equals(subject2)) {
                    check2 = true;
                }

                if (key.equals(subject3)) {
                    check3 = true;
                }


            }
            if (check1 == true && check2 == true && check3 == true) {
                //sl.setId(String.valueOf(cou));
                // sl.setName(coursename);
                System.out.print(coursename);
                //sl.setUniversity(university);
                // retrivelist.save(sl);
                //cou++;

            }
        }
    }
}
