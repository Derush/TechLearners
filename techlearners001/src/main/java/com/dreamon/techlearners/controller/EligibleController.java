package com.dreamon.techlearners.controller;
import com.dreamon.techlearners.repository.eligibleRepository;
import com.dreamon.techlearners.model.eligible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;





import java.util.Map;

@Controller
public class EligibleController {

    @Autowired
    eligibleRepository eligible;

    @RequestMapping("/eligible")
    public  String pageform(Model model)
    {
//        ugcRepository.findAll();
        return "eligible";
    }
    @RequestMapping(value = "/addstream", method = RequestMethod.POST)
    public String addCar(@ModelAttribute eligible z) {
        eligible.save(z);
        return "redirect:eligible";
    }




}
