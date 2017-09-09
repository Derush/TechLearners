package com.dreamon.techlearners.controller;

import com.dreamon.techlearners.model.Eligi;
import com.dreamon.techlearners.model.StoreList;
import com.dreamon.techlearners.model.UGC_Course;
import com.dreamon.techlearners.repository.StoreListRepository;
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
    @Autowired
    StoreListRepository retrivelist;

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

    @RequestMapping(value = "/addstream1", method = RequestMethod.POST)
    public String addSubject1(HttpServletRequest request, Model model) {


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

        StoreList sl = new StoreList();


        List<UGC_Course> newList = course.findAll();
//        String coureses[] = new String[newList.size()];
//        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String coursename = newList.get(i).getname();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

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
            if (check1 == true && check2 == true && check3 == true) {
//                coureses[i] = coursename;
//                sl.setId(String.valueOf(cou));
//                sl.setName(coursename);
//                retrivelist.save(sl);
                System.out.println(coursename);
                model.addAttribute("show", coursename);
//                cou++;

            } else
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

//        for (int i=0 ; i<cou ; i++)
//        {
//            model.addAttribute("show", coureses[i]);
//            System.out.println(coureses[i]);
//        }

        return "showCourses";


    }

    @RequestMapping(value = "/addstream2", method = RequestMethod.POST)
    public String addsSubject2(HttpServletRequest request, Model model) {


        String subject21 = request.getParameter("subject21");
        String subject22 = request.getParameter("subject22");
        String subject23 = request.getParameter("subject23");
        Integer subject21R = Integer.valueOf(request.getParameter("subject21R"));
        Integer subject22R = Integer.valueOf(request.getParameter("subject22R"));
        Integer subject23R = Integer.valueOf(request.getParameter("subject23R"));

        Map<String, Integer> eligi = new HashMap<String, Integer>();
        eligi.put(subject21, subject21R);
        eligi.put(subject22, subject22R);
        eligi.put(subject23, subject23R);

        StoreList sl = new StoreList();


        List<UGC_Course> newList = course.findAll();
        String coureses[] = new String[newList.size()];
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String coursename = newList.get(i).getname();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

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
            if (check1 == true && check2 == true && check3 == true) {
//                coureses[i] =coursename;
//                sl.setId(String.valueOf(cou));
//                sl.setName(coursename);
//                retrivelist.save(sl);
                System.out.println(coursename);
                model.addAttribute("show", coursename);
                cou++;

            } else
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

//        for (int i=0 ; i<cou ; i++)
//        {
//            model.addAttribute("show", coureses[i]);
//            System.out.println(coureses[i]);
//        }

        return "showCourses2";


    }

    @RequestMapping(value = "/addstream3", method = RequestMethod.POST)
    public String addsSubject3(HttpServletRequest request, Model model) {


        String subject31 = request.getParameter("subject31");
        String subject32 = request.getParameter("subject32");
        String subject33 = request.getParameter("subject33");
        Integer subject31R = Integer.valueOf(request.getParameter("subject31R"));
        Integer subject32R = Integer.valueOf(request.getParameter("subject32R"));
        Integer subject33R = Integer.valueOf(request.getParameter("subject33R"));

        Map<String, Integer> eligi = new HashMap<String, Integer>();
        eligi.put(subject31, subject31R);
        eligi.put(subject32, subject32R);
        eligi.put(subject33, subject33R);

        StoreList sl = new StoreList();


        List<UGC_Course> newList = course.findAll();
        String coureses[] = new String[newList.size()];
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String coursename = newList.get(i).getname();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

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
            if (check1 == true && check2 == true && check3 == true) {
//                coureses[i] =coursename;
//                sl.setId(String.valueOf(cou));
//                sl.setName(coursename);
//                retrivelist.save(sl);
                System.out.println(coursename);
                model.addAttribute("show", coursename);
                cou++;

            } else
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

//        for (int i=0 ; i<cou ; i++)
//        {
//            model.addAttribute("show", coureses[i]);
//            System.out.println(coureses[i]);
//        }

        return "showCourses2";


    }

    @RequestMapping(value = "/addstream4", method = RequestMethod.POST)
    public String addsSubject4(HttpServletRequest request, Model model) {


        String subject41 = request.getParameter("subject41");
        String subject42 = request.getParameter("subject42");
        String subject43 = request.getParameter("subject43");
        Integer subject41R = Integer.valueOf(request.getParameter("subject41R"));
        Integer subject42R = Integer.valueOf(request.getParameter("subject42R"));
        Integer subject43R = Integer.valueOf(request.getParameter("subject43R"));

        Map<String, Integer> eligi = new HashMap<String, Integer>();
        eligi.put(subject41, subject41R);
        eligi.put(subject42, subject42R);
        eligi.put(subject43, subject43R);

        StoreList sl = new StoreList();


        List<UGC_Course> newList = course.findAll();
        String coureses[] = new String[newList.size()];
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String coursename = newList.get(i).getname();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

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
            if (check1 == true && check2 == true && check3 == true) {
//                coureses[i] =coursename;
//                sl.setId(String.valueOf(cou));
//                sl.setName(coursename);
//                retrivelist.save(sl);
                System.out.println(coursename);
                model.addAttribute("show", coursename);
                cou++;

            } else
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

//        for (int i=0 ; i<cou ; i++)
//        {
//            model.addAttribute("show", coureses[i]);
//            System.out.println(coureses[i]);
//        }

        return "showCourses2";

    }

    @RequestMapping(value = "/addstream5", method = RequestMethod.POST)
    public String addsSubject5(HttpServletRequest request, Model model) {


        String subject51 = request.getParameter("subject41");
        String subject52 = request.getParameter("subject42");
        String subject53 = request.getParameter("subject43");
        Integer subject51R = Integer.valueOf(request.getParameter("subject51R"));
        Integer subject52R = Integer.valueOf(request.getParameter("subject52R"));
        Integer subject53R = Integer.valueOf(request.getParameter("subject53R"));

        Map<String, Integer> eligi = new HashMap<String, Integer>();
        eligi.put(subject51, subject51R);
        eligi.put(subject52, subject52R);
        eligi.put(subject53, subject53R);

        StoreList sl = new StoreList();


        List<UGC_Course> newList = course.findAll();
        String coureses[] = new String[newList.size()];
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String coursename = newList.get(i).getname();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

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
            if (check1 == true && check2 == true && check3 == true) {
//                coureses[i] =coursename;
//                sl.setId(String.valueOf(cou));
//                sl.setName(coursename);
//                retrivelist.save(sl);
                System.out.println(coursename);
                model.addAttribute("show", coursename);
                cou++;

            } else
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

//        for (int i=0 ; i<cou ; i++)
//        {
//            model.addAttribute("show", coureses[i]);
//            System.out.println(coureses[i]);
//        }

        return "showCourses2";


    }
    @RequestMapping(value = "/addstream6", method = RequestMethod.POST)
    public String addsSubject6(HttpServletRequest request, Model model) {


        String subject61 = request.getParameter("subject41");
        String subject62 = request.getParameter("subject42");
        String subject63 = request.getParameter("subject43");
        Integer subject61R = Integer.valueOf(request.getParameter("subject61R"));
        Integer subject62R = Integer.valueOf(request.getParameter("subject62R"));
        Integer subject63R = Integer.valueOf(request.getParameter("subject63R"));

        Map<String, Integer> eligi = new HashMap<String, Integer>();
        eligi.put(subject61, subject61R);
        eligi.put(subject62, subject62R);
        eligi.put(subject63, subject63R);

        StoreList sl = new StoreList();


        List<UGC_Course> newList = course.findAll();
        String coureses[] = new String[newList.size()];
        int cou = 0;
        for (int i = 0; i < newList.size(); i++) {
            Map<String, Integer> checking = newList.get(i).getEligibility();
            String coursename = newList.get(i).getname();

            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;

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
            if (check1 == true && check2 == true && check3 == true) {
//                coureses[i] =coursename;
//                sl.setId(String.valueOf(cou));
//                sl.setName(coursename);
//                retrivelist.save(sl);
                System.out.println(coursename);
                model.addAttribute("show", coursename);
                cou++;

            } else
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

//        for (int i=0 ; i<cou ; i++)
//        {
//            model.addAttribute("show", coureses[i]);
//            System.out.println(coureses[i]);
//        }

        return "showCourses2";


    }
}
