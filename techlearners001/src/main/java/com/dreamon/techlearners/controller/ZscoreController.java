package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.StoreList;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.model.UGC_Zscore;
import com.dreamon.techlearners.repository.StoreListRepository;
import com.dreamon.techlearners.repository.UGC_ZscoreRepository;
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
public class ZscoreController {

    @Autowired
    UGC_ZscoreRepository course;
    @Autowired
    StoreListRepository retrivelist;

    @RequestMapping("/z-score")
    public String page(Map<String, Object> model) {
//        model.put("message", this.message);
        return "z-score";
    }

    @RequestMapping(value = "/addstreamZ1", method = RequestMethod.POST)
    public String addSubject1(HttpServletRequest request, Model model) {

        retrivelist.deleteAll();

        String subject1 = request.getParameter("subject1");
        String subject2 = request.getParameter("subject2");
        String subject3 = request.getParameter("subject3");
        Integer subject1R = Integer.valueOf(request.getParameter("subject1R"));
        Integer subject2R = Integer.valueOf(request.getParameter("subject2R"));
        Integer subject3R = Integer.valueOf(request.getParameter("subject3R"));
        String District = request.getParameter("district1");
        Float zscore=Float.valueOf(request.getParameter("zid1"));


        StoreList sl = new StoreList();


        List<UGC_Zscore> newList = course.findAll();
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            Map<String, Float> checking2 = newList.get(i).getZscore();
            String coursename = newList.get(i).getName();
            String university = newList.get(i).getUniversity();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            boolean check4 = false;

            for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                String key = entry.getKey().toString();
                Integer value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(subject1)) && (value <= subject1R)) {
                    check1 = true;
                }

                if ((key.equals(subject2)) && (value <= subject2R)) {
                    check2 = true;
                }

                if ((key.equals(subject3)) && (value <= subject3R)) {
                    check3 = true;
                }


            }
            for (Map.Entry<String, Float> entry : checking2.entrySet()) {
                String key = entry.getKey().toString();
                Float value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(District)) && (value <= zscore)) {
                    check4 = true;
                }


            }
            if (check1 == true && check2 == true && check3 == true && check4 == true) {
                sl.setId(String.valueOf(cou));
                sl.setName(coursename);
                sl.setUniversity(university);
                retrivelist.save(sl);
                cou++;

            } else
                System.out.println("no subject there to choose");
        }
        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";


    }

    @RequestMapping(value = "/addstreamZ2", method = RequestMethod.POST)
    public String addSubject2(HttpServletRequest request, Model model) {

        retrivelist.deleteAll();

        String subject21 = request.getParameter("subject21");
        String subject22 = request.getParameter("subject22");
        String subject23 = request.getParameter("subject23");
        Integer subject21R = Integer.valueOf(request.getParameter("subject21R"));
        Integer subject22R = Integer.valueOf(request.getParameter("subject22R"));
        Integer subject23R = Integer.valueOf(request.getParameter("subject23R"));
        String District = request.getParameter("district2");
        Float zscore=Float.valueOf(request.getParameter("zid2"));

        StoreList sl = new StoreList();


        List<UGC_Zscore> newList = course.findAll();
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            Map<String, Float> checking2 = newList.get(i).getZscore();
            String coursename = newList.get(i).getName();
            String university = newList.get(i).getUniversity();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            boolean check4 = false;

            for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                String key = entry.getKey().toString();
                Integer value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(subject21)) && (value <= subject21R)) {
                    check1 = true;
                }

                if ((key.equals(subject22)) && (value <= subject22R)) {
                    check2 = true;
                }

                if ((key.equals(subject23)) && (value <= subject23R)) {
                    check3 = true;
                }


            }
            for (Map.Entry<String, Float> entry : checking2.entrySet()) {
                String key = entry.getKey().toString();
                Float value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(District)) && (value <= zscore)) {
                    check4 = true;
                }


            }
            if (check1 == true && check2 == true && check3 == true && check4 == true) {
                sl.setId(String.valueOf(cou));
                sl.setName(coursename);
                sl.setUniversity(university);
                retrivelist.save(sl);
                cou++;

            } else
                System.out.println("no subject there to choose");
        }

        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";


    }

    @RequestMapping(value = "/addstreamZ3", method = RequestMethod.POST)
    public String addSubject3(HttpServletRequest request, Model model) {

        retrivelist.deleteAll();

        String subject31 = request.getParameter("subject31");
        String subject32 = request.getParameter("subject32");
        String subject33 = request.getParameter("subject33");
        Integer subject31R = Integer.valueOf(request.getParameter("subject31R"));
        Integer subject32R = Integer.valueOf(request.getParameter("subject32R"));
        Integer subject33R = Integer.valueOf(request.getParameter("subject33R"));
        String District = request.getParameter("district3");
        Float zscore=Float.valueOf(request.getParameter("zid3"));

        StoreList sl = new StoreList();


        List<UGC_Zscore> newList = course.findAll();
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            Map<String, Float> checking2 = newList.get(i).getZscore();
            String coursename = newList.get(i).getName();
            String university = newList.get(i).getUniversity();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            boolean check4 = false;

            for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                String key = entry.getKey().toString();
                Integer value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(subject31)) && (value <= subject31R)) {
                    check1 = true;
                }

                if ((key.equals(subject32)) && (value <= subject32R)) {
                    check2 = true;
                }

                if ((key.equals(subject33)) && (value <= subject33R)) {
                    check3 = true;
                }


            }
            for (Map.Entry<String, Float> entry : checking2.entrySet()) {
                String key = entry.getKey().toString();
                Float value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(District)) && (value <= zscore)) {
                    check4 = true;
                }


            }
            if (check1 == true && check2 == true && check3 == true && check4 == true) {
                sl.setId(String.valueOf(cou));
                sl.setName(coursename);
                sl.setUniversity(university);
                retrivelist.save(sl);
                cou++;

            } else
                System.out.println("no subject there to choose");
        }


        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";


    }

    @RequestMapping(value = "/addstreamZ4", method = RequestMethod.POST)
    public String addSubject4(HttpServletRequest request, Model model) {

        retrivelist.deleteAll();

        String subject41 = request.getParameter("subject41");
        String subject42 = request.getParameter("subject42");
        String subject43 = request.getParameter("subject43");
        Integer subject41R = Integer.valueOf(request.getParameter("subject41R"));
        Integer subject42R = Integer.valueOf(request.getParameter("subject42R"));
        Integer subject43R = Integer.valueOf(request.getParameter("subject43R"));
        String District = request.getParameter("district4");
        Float zscore=Float.valueOf(request.getParameter("zid4"));


        StoreList sl = new StoreList();


        List<UGC_Zscore> newList = course.findAll();
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            Map<String, Float> checking2 = newList.get(i).getZscore();
            String coursename = newList.get(i).getName();
            String university = newList.get(i).getUniversity();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            boolean check4 = false;

            for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                String key = entry.getKey().toString();
                Integer value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(subject41)) && (value <= subject41R)) {
                    check1 = true;
                }

                if ((key.equals(subject42)) && (value <= subject42R)) {
                    check2 = true;
                }

                if ((key.equals(subject43)) && (value <= subject43R)) {
                    check3 = true;
                }


            }
            for (Map.Entry<String, Float> entry : checking2.entrySet()) {
                String key = entry.getKey().toString();
                Float value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(District)) && (value <= zscore)) {
                    check4 = true;
                }


            }
            if (check1 == true && check2 == true && check3 == true && check4 == true) {
                sl.setId(String.valueOf(cou));
                sl.setName(coursename);
                sl.setUniversity(university);
                retrivelist.save(sl);
                cou++;

            } else
                System.out.println("no subject there to choose");
        }

        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";


    }

    @RequestMapping(value = "/addstreamZ5", method = RequestMethod.POST)
    public String addSubject5(HttpServletRequest request, Model model) {

        retrivelist.deleteAll();

        String subject51 = request.getParameter("subject51");
        String subject52 = request.getParameter("subject52");
        String subject53 = request.getParameter("subject53");
        Integer subject51R = Integer.valueOf(request.getParameter("subject51R"));
        Integer subject52R = Integer.valueOf(request.getParameter("subject52R"));
        Integer subject53R = Integer.valueOf(request.getParameter("subject53R"));
        String District = request.getParameter("district5");
        Float zscore=Float.valueOf(request.getParameter("zid5"));


        StoreList sl = new StoreList();


        List<UGC_Zscore> newList = course.findAll();
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            Map<String, Float> checking2 = newList.get(i).getZscore();
            String coursename = newList.get(i).getName();
            String university = newList.get(i).getUniversity();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            boolean check4 = false;

            for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                String key = entry.getKey().toString();
                Integer value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(subject51)) && (value <= subject51R)) {
                    check1 = true;
                }

                if ((key.equals(subject52)) && (value <= subject52R)) {
                    check2 = true;
                }

                if ((key.equals(subject53)) && (value <= subject53R)) {
                    check3 = true;
                }


            }
            for (Map.Entry<String, Float> entry : checking2.entrySet()) {
                String key = entry.getKey().toString();
                Float value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(District)) && (value <= zscore)) {
                    check4 = true;
                }


            }
            if (check1 == true && check2 == true && check3 == true && check4 == true) {
                sl.setId(String.valueOf(cou));
                sl.setName(coursename);
                sl.setUniversity(university);
                retrivelist.save(sl);
                cou++;

            } else
                System.out.println("no subject there to choose");
        }

        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";


    }

    @RequestMapping(value = "/addstreamZ6", method = RequestMethod.POST)
    public String addSubject6(HttpServletRequest request, Model model) {

        retrivelist.deleteAll();

        String subject61 = request.getParameter("subject61");
        String subject62 = request.getParameter("subject62");
        String subject63 = request.getParameter("subject63");
        Integer subject61R = Integer.valueOf(request.getParameter("subject61R"));
        Integer subject62R = Integer.valueOf(request.getParameter("subject62R"));
        Integer subject63R = Integer.valueOf(request.getParameter("subject63R"));
        String District = request.getParameter("district6");
        Float zscore=Float.valueOf(request.getParameter("zid6"));

        StoreList sl = new StoreList();

        List<UGC_Zscore> newList = course.findAll();
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            Map<String, Float> checking2 = newList.get(i).getZscore();
            String coursename = newList.get(i).getName();
            String university = newList.get(i).getUniversity();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            boolean check4 = false;

            for (Map.Entry<String, Integer> entry : checking.entrySet()) {
                String key = entry.getKey().toString();
                Integer value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(subject61)) && (value <= subject61R)) {
                    check1 = true;
                }

                if ((key.equals(subject62)) && (value <= subject62R)) {
                    check2 = true;
                }

                if ((key.equals(subject63)) && (value <= subject63R)) {
                    check3 = true;
                }


            }
            for (Map.Entry<String, Float> entry : checking2.entrySet()) {
                String key = entry.getKey().toString();
                Float value = entry.getValue();
                System.out.println("key, " + key + " value " + value);
                if ((key.equals(District)) && (value <= zscore)) {
                    check4 = true;
                }


            }
            if (check1 == true && check2 == true && check3 == true && check4 == true) {
                sl.setId(String.valueOf(cou));
                sl.setName(coursename);
                sl.setUniversity(university);
                retrivelist.save(sl);
                cou++;

            } else
                System.out.println("no subject there to choose");
        }
        model.addAttribute("show", retrivelist.findAll());
        return "showCourses";

    }
}
