package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.Eligi;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.repository.UGCRepository;
import com.dreamon.techlearners.repository.eligibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EligibleController {

    @Autowired
    eligibleRepository eligi;
    @Autowired
    UGCRepository course;

    @RequestMapping("/eligible")
    public String pageform(Model model) {
//        ugcRepository.findAll();
        return "eligible";
    }
//    @RequestMapping(value = "/addstream", method = RequestMethod.POST)
//    public String addCar(@ModelAttribute eligible z) {
//
//        eligible.save(z);
//        return "redirect:eligible";
//    }
    @RequestMapping("/showCourses")
    public String coursesShow(Model model) {
//         model.addAttribute("show", course.findAll());

    return "showCourses";
    }
    @RequestMapping(value = "/addstream", method = RequestMethod.POST)
    public String addCar(HttpServletRequest request , Model model) {



        String subject1 = request.getParameter("subject1");
        String subject2 = request.getParameter("subject2");
        String subject3 = request.getParameter("subject3");
        Integer subject1R = Integer.valueOf(request.getParameter("subject1R"));
        Integer subject2R = Integer.valueOf(request.getParameter("subject2R"));
        Integer subject3R = Integer.valueOf(request.getParameter("subject3R"));

        Map<String, Integer> eligi = new HashMap<String, Integer>();
        eligi.put(subject1, subject1R);
        eligi.put(subject2, subject2R);
        eligi.put(subject3, subject3R);




        List <UGC_Course> newList = course.findAll();
       for(int i=0 ; i<newList.size() ; i++)
       {
           Map<String,Integer> checking = newList.get(i).getEligibility();
           String coursename=newList.get(i).getname();

           boolean check1=false;
           boolean check2=false;
           boolean check3=false;

           for (Map.Entry<String, Integer> entry : checking.entrySet()) {
               String key = entry.getKey().toString();
               Integer value = entry.getValue();
               System.out.println("key, " + key + " value " + value);
               if ((key.equals(subject1)) && (value < subject1R)) {
                   check1 = true;
               }

               if ((key.equals(subject2)) && (value < subject2R)) {
                   check2 = true;
               }

               if ((key.equals(subject3)) && (value < subject3R)) {
                   check3 = true;
               }


           }
           if(check1==true && check2==true &&  check3==true  ) {
               System.out.println(coursename);
               model.addAttribute("show", coursename);

           }
           else
               System.out.println("no subject there to choose");
       }
/*        Map<String,Integer> checking = newList.get(2).getEligibility();
        String coursename=newList.get(2).getname();

        boolean check1=false;
        boolean check2=false;
        boolean check3=false;

        for (Map.Entry<String, Integer> entry : checking.entrySet()) {
            String key = entry.getKey().toString();
            Integer value = entry.getValue();
            System.out.println("key, " + key + " value " + value);
            if ((key.equals(subject1)) && (value < subject1R)) {
                check1 = true;
            }

            if ((key.equals(subject2)) && (value < subject2R)) {
                check2 = true;
            }

            if ((key.equals(subject3)) && (value < subject3R)) {
                check3 = true;
            }


        }
        if(check1==true || check2==true ||  check3==true  ) {
            System.out.println(coursename);

        }*/
//        return "redirect:eligible";
        return "showCourses";


    }


}
