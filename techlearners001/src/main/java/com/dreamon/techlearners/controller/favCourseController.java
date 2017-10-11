package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.StoreList;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.repository.StoreListRepository;
import com.dreamon.techlearners.repository.UGCRepository;
import com.dreamon.techlearners.repository.eligibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
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

  @RequestMapping("/favCourse")
  public String pageform(Model model) {
    return "favCourse";
  }

  @RequestMapping(value = "/selectphisical", method = RequestMethod.POST)
  public String search(HttpServletRequest request, Model model) {
    retrivelist.deleteAll();
    String subject1 = request.getParameter("subject1");
    String subject2 = request.getParameter("subject2");
    String subject3 = request.getParameter("subject3");
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
        sl.setId(String.valueOf(cou));
        sl.setName(coursename);
        System.out.println(coursename + " " + university);
        sl.setUniversity(university);
        retrivelist.save(sl);
        cou++;

      }
    }
    model.addAttribute("show", retrivelist.findAll());
    return "showCourses";
  }


  @RequestMapping(value = "/selectTech", method = RequestMethod.POST)
  public String search3(HttpServletRequest request, Model model) {
    retrivelist.deleteAll();

    String subject31 = request.getParameter("subject31");
    String subject32 = request.getParameter("subject32");
    String subject33 = request.getParameter("subject33");


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
        if (key.equals(subject31)) {
          check1 = true;
        }

        if (key.equals(subject32)) {
          check2 = true;
        }

        if (key.equals(subject33)) {
          check3 = true;
        }


      }
      if (check1 == true && check2 == true && check3 == true) {
        sl.setId(String.valueOf(cou));
        sl.setName(coursename);
        System.out.print(coursename);
        sl.setUniversity(university);
        retrivelist.save(sl);
        cou++;

      }
    }
    model.addAttribute("show", retrivelist.findAll());
    return "showCourses";
  }

  @RequestMapping(value = "/selectBio", method = RequestMethod.POST)
  public String search2(HttpServletRequest request, Model model) {
    retrivelist.deleteAll();

    String subject21 = request.getParameter("subject21");
    String subject22 = request.getParameter("subject22");
    String subject23 = request.getParameter("subject23");


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
        if (key.equals(subject21)) {
          check1 = true;
        }

        if (key.equals(subject22)) {
          check2 = true;
        }

        if (key.equals(subject23)) {
          check3 = true;
        }


      }
      if (check1 == true && check2 == true && check3 == true) {
        sl.setId(String.valueOf(cou));
        sl.setName(coursename);
        System.out.print(coursename);
        sl.setUniversity(university);
        retrivelist.save(sl);
        cou++;

      }
    }
    model.addAttribute("show", retrivelist.findAll());
    return "showCourses";
  }




  @RequestMapping(value = "/selectcom", method = RequestMethod.POST)
  public String search4(HttpServletRequest request, Model model) {
    retrivelist.deleteAll();

    String subject41 = request.getParameter("subject41");
    String subject42 = request.getParameter("subject42");
    String subject43 = request.getParameter("subject43");


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
        if (key.equals(subject41)) {
          check1 = true;
        }

        if (key.equals(subject42)) {
          check2 = true;
        }

        if (key.equals(subject43)) {
          check3 = true;
        }


      }
      if (check1 == true && check2 == true && check3 == true) {
        sl.setId(String.valueOf(cou));
        sl.setName(coursename);
        System.out.print(coursename);
        sl.setUniversity(university);
        retrivelist.save(sl);
        cou++;

      }
    }
    model.addAttribute("show", retrivelist.findAll());
    return "showCourses";
  }




  @RequestMapping(value = "/selectart", method = RequestMethod.POST)
  public String search5(HttpServletRequest request, Model model) {
    retrivelist.deleteAll();

    String subject51 = request.getParameter("subject51");
    String subject52 = request.getParameter("subject52");
    String subject53 = request.getParameter("subject53");


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
        if (key.equals(subject51)) {
          check1 = true;
        }

        if (key.equals(subject52)) {
          check2 = true;
        }

        if (key.equals(subject53)) {
          check3 = true;
        }


      }
      if (check1 == true && check2 == true && check3 == true) {
        sl.setId(String.valueOf(cou));
        sl.setName(coursename);
        System.out.print(coursename);
        sl.setUniversity(university);
        retrivelist.save(sl);
        cou++;

      }
    }
    model.addAttribute("show", retrivelist.findAll());
    return "showCourses";
  }


  @RequestMapping(value = "/selectother", method = RequestMethod.POST)
  public String search6(HttpServletRequest request, Model model) {
    retrivelist.deleteAll();

    String subject61 = request.getParameter("subject61");
    String subject62 = request.getParameter("subject62");
    String subject63 = request.getParameter("subject63");


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
        if (key.equals(subject61)) {
          check1 = true;
        }

        if (key.equals(subject62)) {
          check2 = true;
        }

        if (key.equals(subject63)) {
          check3 = true;
        }


      }
      if (check1 == true && check2 == true && check3 == true) {
        sl.setId(String.valueOf(cou));
        sl.setName(coursename);
        System.out.print(coursename);
        sl.setUniversity(university);
        retrivelist.save(sl);
        cou++;

      }
    }
    model.addAttribute("show", retrivelist.findAll());
    return "showCourses";
  }
}
