package com.dreamon.techlearners.model;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.HashMap;
import java.util.Map;

@Document(collection = "Eli")

public class eligible {

    private String id;
    private String subject1;
    private String subject2;
    private String subject3;
    private Integer subject1R;
    private Integer subject2R;
    private Integer subject3R;

    private String stream;
    private Map<String, Integer> eligi = new HashMap();


    public Integer getSubject1R() {
        return subject1R;
    }

    public void setSubject1R(Integer subject1R) {
        this.subject1R = subject1R;
    }

    public Integer getSubject2R() {
        return subject2R;
    }

    public void setSubject2R(Integer subject2R) {
        this.subject2R = subject2R;
    }

    public Integer getSubject3R() {
        return subject3R;
    }

    public void setSubject3R(Integer subject3R) {
        this.subject3R = subject3R;
    }



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


    public String getstream() {
        return stream;
    }
    public void setstream(String stream) {
        this.stream = stream;
    }











}
