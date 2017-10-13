package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.OlSubjectShow;
import com.dreamon.techlearners.model.StoreList;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.model.stream;
import com.dreamon.techlearners.repository.*;
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
    @Autowired
    OlSubjectRepositorty retrivelist2;
    @RequestMapping("/selectStream")
    public String coursesShow(Model model) {

        return "selectStream";
    }


    @RequestMapping(name = "/arts", value = "/arts", method = RequestMethod.POST)
    public String check1(HttpServletRequest request, Model model) {

        retrivelist2.deleteAll();

        String subject51 = request.getParameter("subject51");
        String subject52 = request.getParameter("subject52");
        String subject53 = request.getParameter("subject53");
        OlSubjectShow sl = new OlSubjectShow();
        List<stream> newList =st.findAll();


        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String name = newList.get(i).getName();
            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            String key=null;
            Integer value=null;
            if (name.equals(subject51) || name.equals(subject52) || name.equals(subject53)) {
                for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                    key = entry.getKey().toString();
                    value = entry.getValue();
                    check1=true;
                }
                if(check1==true)
                {
                    sl.setId(String.valueOf(cou));
                    sl.setSubName(key);

                    switch (value)
                    {
                        case 4:
                            sl.setValue("A");
                            break;
                        case 3:
                            sl.setValue("B");
                            break;
                        case 2:
                            sl.setValue("C");
                            break;
                        default:
                            sl.setValue("S");
                    }
                    retrivelist2.save(sl);
                    cou++;
                    System.out.println(" you have to take "+key+" in Ordinary level and should get"+ value +" passes"+" or ");
                }

        }
        else

                System.out.println("you are qualified for this combinations");
            }
        model.addAttribute("show", retrivelist2.findAll());
        return "OlSubjectSelect";
    }

    @RequestMapping(name = "/other", value = "/other", method = RequestMethod.POST)
    public String check2(HttpServletRequest request, Model model) {

        retrivelist2.deleteAll();

        String subject61 = request.getParameter("subject61");
        String subject62 = request.getParameter("subject62");
        String subject63 = request.getParameter("subject63");
        OlSubjectShow sl = new OlSubjectShow();
        List<stream> newList =st.findAll();

        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String name = newList.get(i).getName();
            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            String key=null;
            Integer value=null;

            if (name.equals(subject61) || name.equals(subject62) || name.equals(subject63)) {
                for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                    key = entry.getKey().toString();
                    value = entry.getValue();
                    check1=true;
                }
                if(check1==true)
                {
                    sl.setId(String.valueOf(cou));
                    sl.setSubName(key);

                    switch (value)
                    {
                        case 4:
                            sl.setValue("A");
                            break;
                        case 3:
                            sl.setValue("B");
                            break;
                        case 2:
                            sl.setValue("C");
                            break;
                        default:
                            sl.setValue("S");
                    }
                    retrivelist2.save(sl);
                    cou++;
                    System.out.println(" you have to take "+key+" in Ordinary level and should get"+ value +" passes"+" or ");
                }

            }
            else

                System.out.println("You are eligible to follow these combinations");
        }
        model.addAttribute("show", retrivelist2.findAll());
        return "OlSubjectSelect";
    }


    @RequestMapping(name = "/commerce", value = "/commerce", method = RequestMethod.POST)
    public String check3(HttpServletRequest request, Model model) {

         retrivelist2.deleteAll();

        String subject41 = request.getParameter("subject41");
        String subject42 = request.getParameter("subject42");
        String subject43 = request.getParameter("subject43");
        OlSubjectShow sl = new OlSubjectShow();
        List<stream> newList =st.findAll();

        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String name = newList.get(i).getName();
            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            String key=null;
            Integer value=null;
            if (name.equals(subject41) || name.equals(subject42) || name.equals(subject43)) {
                for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                    key = entry.getKey().toString();
                    value = entry.getValue();
                    check1=true;
                }
                if(check1==true)
                {
                    sl.setId(String.valueOf(cou));
                    sl.setSubName(key);

                    switch (value)
                    {
                        case 4:
                            sl.setValue("A");
                            break;
                        case 3:
                            sl.setValue("B");
                            break;
                        case 2:
                            sl.setValue("C");
                            break;
                        default:
                            sl.setValue("S");
                    }
                    retrivelist2.save(sl);
                    cou++;
                    System.out.println(" you have to take "+key+" in Ordinary level and should get"+ value +" passes"+" or ");
                }

            }
            else

                System.out.println("You are eligible to follow these combinations");
        }
        model.addAttribute("show", retrivelist2.findAll());
        return "OlSubjectSelect";
    }


}

