package com.dreamon.techlearners.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Eligible")
public class eligible {

    private String id;
    private String subject1;
    private String subject2;
    private String subject3;
    private String subject1R;
    private String subject2R;
    private String subject3R;

    private String stream;
    public eligible() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getstream() {
        return stream;
    }
    public void setstream(String stream) {
        this.stream = stream;
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
}
