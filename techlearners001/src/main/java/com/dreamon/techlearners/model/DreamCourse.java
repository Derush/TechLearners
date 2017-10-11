package com.dreamon.techlearners.model;

import java.util.HashMap;
import java.util.Map;

public class DreamCourse {
    private String id;
    private String subject1;
    private String subject2;
    private String subject3;
    private String course;

    private Map<String, Integer> eligi = new HashMap();




    public DreamCourse () {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getsubject1() {
        return subject1;
    }

    public void setsubject1(String subject1) {
        this.subject1 = subject1;
    }


    public String getsubject2() {
        return subject2;
    }

    public void setsubject2(String subject2) {
        this.subject2 = subject2;
    }


    public String getsubject3() {
        return subject3;
    }

    public void setsubject3(String subject3) {
        this.subject3 = subject3;
    }




    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
