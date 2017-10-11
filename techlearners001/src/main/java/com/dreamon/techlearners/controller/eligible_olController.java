package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.StreamList;
import com.dreamon.techlearners.model.eligible_ol;
import com.dreamon.techlearners.repository.StreamListRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class eligible_olController {

    @Autowired
    StreamListRepository retrivelist;

    @RequestMapping("/eligible_ol")
    public String pageform(Model model) {
//        optionRepository.findAll();
        return "eligible_ol";
    }

    @RequestMapping(value = "/Qualification", method = RequestMethod.POST)
    public String Qual(HttpServletRequest request, Model model) {

        retrivelist.deleteAll();

        String statement = null;
        String subject1 = request.getParameter("subject1");
        String subject2 = request.getParameter("subject2");
        String subject3 = request.getParameter("subject3");
        String subject4 = request.getParameter("subject4");
        String subject5 = request.getParameter("subject5");
        String subject6 = request.getParameter("subject6");
        String subject7 = request.getParameter("subject7");
        String subject8 = request.getParameter("subject8");
        String subject9 = request.getParameter("subject9");
        Integer subject1R = Integer.valueOf(request.getParameter("subject1R"));
        Integer subject2R = Integer.valueOf(request.getParameter("subject2R"));
        Integer subject3R = Integer.valueOf(request.getParameter("subject3R"));
        Integer subject4R = Integer.valueOf(request.getParameter("subject4R"));
        Integer subject5R = Integer.valueOf(request.getParameter("subject5R"));
        Integer subject6R = Integer.valueOf(request.getParameter("subject6R"));
        Integer subject7R = Integer.valueOf(request.getParameter("subject7R"));
        Integer subject8R = Integer.valueOf(request.getParameter("subject8R"));
        Integer subject9R = Integer.valueOf(request.getParameter("subject9R"));
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;
        boolean check4 = false;
        boolean phyeligibility = false;
        boolean bioeligibility=false;
        boolean techeligibility=false;
        boolean comeligibility=false;
        boolean s1=false;
        boolean s2=false;
        boolean s3=false;
        boolean s4=false;
        eligible_ol eligible_ol1 = new eligible_ol();
        StreamList SL =new StreamList();
        int count = 0;
        int num = 0;
        if ((subject1R >= 1) && (subject2R >= 1)) {
            check1 = true;
        }
        if (subject3R >= 1) {
            count++;
            if (subject3R >= 2) {
                num++;
            }
        }
        if (subject4R >= 1) {
            count++;
            if (subject4R >= 2) {
                num++;
            }
        }
        if (subject5R >= 1) {
            count++;
            if (subject5R >= 2) {
                num++;
            }
        }
        if (subject6R >= 1) {
            count++;
            if (subject6R >= 2) {
                num++;
            }
        }
        if (subject7R >= 1) {
            count++;
        }
        if (subject8R >= 1) {
            count++;
            if (subject8R >= 2) {
                num++;
            }
        }
        if (subject9R >= 1) {
            count++;
            if (subject9R >= 2) {
                num++;
            }
        }
        if (subject1R >= 2) {
            num++;
        }
        if (subject2R >= 2) {
            num++;
        }
        if (count >= 6) {
            check2 = true;
            if (num >= 3) {
                check3 = true;
            }
        }
        if (check1 == true && check2 == true && check3 == true) {
            System.out.print("your are qualified");
//            statement = "selectStream";
            check4 = true;

        } else {
            System.out.print("you are not qualified");
//            statement = "showCourses";
        }
        if (check4 == true ) {
            if ((subject1R >= 2)) {
                phyeligibility = true;
                System.out.print("physicalScience");
            }
            if ( subject2R >= 2)
            {
                bioeligibility=true;
                System.out.print("BioScience");
            }
            if(subject9.equals("Information & Communication Technology")&&(subject9R>=1))
            {
            techeligibility=true;
                System.out.print("Technology");
            }
            if(subject7.equals("Business Studies and Accounting")&&(subject7R>=1))
            {
                comeligibility=true;
                System.out.print("Commerce");
            }
        }
        if(phyeligibility == true)
        {
            SL.setId(String.valueOf(01));
            SL.setStream("Physical Science");
            s1=true;
        }
        if(bioeligibility == true)
        {
            SL.setId(String.valueOf(02));
            SL.setStream("Bio Science");
            s2=true;
        }
        if(techeligibility == true)
        {
            SL.setId(String.valueOf(03));
            SL.setStream("Technology");
            s3=true;
        }
        if(comeligibility == true)
        {
            SL.setId(String.valueOf(04));
            SL.setStream("Commerce");
            s3=true;
        }
//        if(s1==true)
//        {
//            retrivelist.save(SL);
//        }
//        if(s2==true)
//        {
//            retrivelist.save(SL);
//        }
//        if(s3==true)
//        {
//            retrivelist.save(SL);
//        }
//        if(s4==true)
//        {
//            retrivelist.save(SL);
//        }
        if(s1==true && s2==true)
        {
            retrivelist.save(SL);
        }

        if(s1==true && s2==true && s3==true)
        {
            retrivelist.save(SL);
        }
        if(s1==true && s2==true && s3==true && s4==true)
        {
            retrivelist.save(SL);
        }



        model.addAttribute("show",retrivelist.findAll());
        return "selectStream";


    }
}

