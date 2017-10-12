package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.StoreList;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.model.stream;
import com.dreamon.techlearners.repository.StoreListRepository;
import com.dreamon.techlearners.repository.UGCRepository;
import com.dreamon.techlearners.repository.eligibleRepository;
import com.dreamon.techlearners.repository.streamRepository;
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
    streamRepository st;
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
        StoreList sl = new StoreList();
        List<stream> newList =st.findAll();

        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String name = newList.get(i).getName();
            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

            if (name.equals(subject51) || name.equals(subject52) || name.equals(subject53)) {
                for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                    String key = entry.getKey().toString();
                    Integer value = entry.getValue();
                    System.out.println(" you have to take "+key+" in Ordinary level and should get"+ value +" passes"+" or ");


                }

        }
        else

                System.out.println("you are qualified for this combinations");
            }
        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";
    }

    @RequestMapping(name = "/other", value = "/other", method = RequestMethod.POST)
    public String check2(HttpServletRequest request, Model model) {

        // retrivelist.deleteAll();

        String subject51 = request.getParameter("subject51");
        String subject52 = request.getParameter("subject52");
        String subject53 = request.getParameter("subject53");
        StoreList sl = new StoreList();
        List<stream> newList =st.findAll();

        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String name = newList.get(i).getName();
            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

            if (name.equals(subject51) || name.equals(subject52) || name.equals(subject53)) {
                for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                    String key = entry.getKey().toString();
                    Integer value = entry.getValue();
                    System.out.println(" you have to take "+key+" in Ordinary level and should get"+ value +" passes"+" or ");


                }

            }
            else

                System.out.println("you are qualified for this combinations");
        }
        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";
    }


}

