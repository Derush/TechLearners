package com.dreamon.techlearners.controller;

        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
@Controller
public class HomeController {
    @RequestMapping("/Home")
    public String pageform(Model model) {
        return "Home";
    }
}


