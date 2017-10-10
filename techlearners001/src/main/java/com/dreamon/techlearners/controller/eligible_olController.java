package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.eligible_ol;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class eligible_olController {

    @RequestMapping("/eligible_ol")
    public String pageform(Model model) {
//        optionRepository.findAll();
        return "eligible_ol";
    }

@RequestMapping(value="/Qualification",method= RequestMethod.POST)
public String Qual(HttpServletRequest request, Model model)
{
    String subject1=request.getParameter("subject1");
    String subject2=request.getParameter("subject2");
    String subject3=request.getParameter("subject3");
    String subject4=request.getParameter("subject4");
    String subject5=request.getParameter("subject5");
    String subject6=request.getParameter("subject6");
    String subject7=request.getParameter("subject7");
    String subject8=request.getParameter("subject8");
    String subject9=request.getParameter("subject9");
    Integer subject1R=Integer.valueOf(request.getParameter("subject1R"));
    Integer subject2R=Integer.valueOf(request.getParameter("subject2R"));
    Integer subject3R=Integer.valueOf(request.getParameter("subject3R"));
    Integer subject4R=Integer.valueOf(request.getParameter("subject4R"));
    Integer subject5R= Integer.valueOf(request.getParameter("subject5R"));
    Integer subject6R=Integer.valueOf(request.getParameter("subject6R"));
    Integer subject7R=Integer.valueOf(request.getParameter("subject7R"));
    Integer subject8R=Integer.valueOf(request.getParameter("subject8R"));
    Integer subject9R=Integer.valueOf(request.getParameter("subject9R"));
    boolean check1=false;
    boolean check2=false;
    boolean check3=false;

    eligible_ol eligible_ol1 =new eligible_ol();

    int count=0;
    int num=0;
    if((subject1R>=1)&&(subject2R>=1))
    {
        check1=true;
    }
    if(subject3R>=1)
    {
        count++;
        if(subject3R>=2)
        {
            num++;
        }
    }
    if(subject4R>=1)
    {
        count++;
        if(subject4R>=2)
        {
            num++;
        }
    }
    if(subject5R>=1)
    {
        count++;
        if(subject5R>=2)
        {
            num++;
        }
    }
    if(subject6R>=1)
    {
        count++;
        if(subject6R>=2)
        {
            num++;
        }
    }
    if(subject7R>=1)
    {
        count++;
    }
    if(subject8R>=1)
    {
        count++;
        if(subject8R>=2)
        {
            num++;
        }
    }
    if(subject9R>=1)
    {
        count++;
        if(subject9R>=2)
        {
            num++;
        }
    }
    if(subject1R>=2)
    {
        num++;
    }
    if(subject2R>=2)
    {
        num++;
    }
    if(count>=6)
    {
        check2=true;
        if(num>=3)
        {
            check3=true;
        }
    }
    if(check1==true && check2 && check3==true)
    {
   System.out.print("your are qualified");
    }
    else
    {
        System.out.print("you are not qualified");
    }





return "showcourses";
}
}

