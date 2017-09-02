package com.dreamon.techlearners.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Eli")
public class eligible {

    private String id;
    private String subject1;
    private String subject2;
    private String subject3;
    private String subject1R;
    private String subject2R;
    private String subject3R;

    private String subject21;
    private String subject22;
    private String subject23;
    private String subject21R;
    private String subject22R;
    private String subject23R;
    private String stream;


    public eligible() {}

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


    public String getsubject1R() {
        return subject1R;
    }
    public void setsubject1R(String subject1R) {
        this.subject1R = subject1R;
    }



    public String getsubject2() {
        return subject2;
    }
    public void setsubject2(String subject2) {
        this.subject2 = subject2;
    }


    public String getsubject2R() {
        return subject2R;
    }
    public void setsubject2R(String subject2R) {
        this.subject2R = subject2R;
    }




    public String getsubject3() {
        return subject3;
    }
    public void setsubject3(String subject3) {
        this.subject3 = subject3;
    }


    public String getsubject3R() {
        return subject3R;
    }
    public void setsubject3R(String subject3R) {
        this.subject3R = subject3R;
    }


    public String getstream() {
        return stream;
    }
    public void setstream(String stream) {
        this.stream = stream;
    }









    public String getsubject21() {
        return subject21;
    }
    public void setsubject21(String subject21) {
        this.subject21 = subject21;
    }


    public String getsubject21R() {
        return subject21R;
    }
    public void setsubject21R(String subject21R) {
        this.subject21R = subject21R;
    }



    public String getsubject22() {
        return subject22;
    }
    public void setsubject22(String subject22) {
        this.subject22 = subject22;
    }


    public String getsubject22R() {
        return subject22R;
    }
    public void setsubject22R(String subject22R) {
        this.subject22R = subject22R;
    }




    public String getsubject23() {
        return subject23;
    }
    public void setsubject23(String subject23) {
        this.subject23 = subject23;
    }


    public String getsubject23R() {
        return subject23R;
    }
    public void setsubject23R(String subject23R) {
        this.subject23R = subject23R;
    }



}
