package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.Login;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class adminPanelController {
    @Autowired
    LoginRepository log;

    @RequestMapping("/adminLoginPanel")
    public String adminPanel(Model model)
    {

        return  "adminLoginPanel";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginPanel(Model model, HttpServletRequest request)
    {
        String pages= null;
        Login login = new Login();
        String username=request.getParameter("username");
        String password=request.getParameter("pass");

        List<Login> newList = (List<Login>) log.findAll();
        if(newList.get(0).getUsername().equals(username) && newList.get(0).getPassword().equals(password))
        {
            pages="adminDashboard";
        }
        else
        {
            pages="adminLoginPanel";
        }

        return pages;

    }
}
