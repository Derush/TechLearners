package com.dreamon.techlearners.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "Eli")
public class eligible_ol {


    private String id;
    private String subject1;
    private String subject2;
    private String subject3;
    private String subject4;


    private String subject5;
    private String subject6;
    private String subject7;
    private String subject8;
    private String subject9;

    private Integer subject1R;
    private Integer subject2R;
    private Integer subject3R;
    private Integer subject4R;
    private Integer subject5R;
    private Integer subject6R;
    private Integer subject7R;
    private Integer subject8R;
    private Integer subject9R;

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

    public String getSubject4() {
        return subject4;
    }

    public void setSubject4(String subject4) {
        this.subject4 = subject4;
    }

    public String getSubject5() {
        return subject5;
    }

    public void setSubject5(String subject5) {
        this.subject5 = subject5;
    }

    public String getSubject6() {
        return subject6;
    }

    public void setSubject6(String subject6) {
        this.subject6 = subject6;
    }

    public String getSubject7() {
        return subject7;
    }

    public void setSubject7(String subject7) {
        this.subject7 = subject7;
    }

    public String getSubject8() {
        return subject8;
    }

    public void setSubject8(String subject8) {
        this.subject8 = subject8;
    }

    public String getSubject9() {
        return subject9;
    }

    public void setSubject9(String subject9) {
        this.subject9 = subject9;
    }

    public Integer getSubject4R() {
        return subject4R;
    }

    public void setSubject4R(Integer subject4R) {
        this.subject4R = subject4R;
    }

    public Integer getSubject5R() {
        return subject5R;
    }

    public void setSubject5R(Integer subject5R) {
        this.subject5R = subject5R;
    }

    public Integer getSubject6R() {
        return subject6R;
    }

    public void setSubject6R(Integer subject6R) {
        this.subject6R = subject6R;
    }

    public Integer getSubject7R() {
        return subject7R;
    }

    public void setSubject7R(Integer subject7R) {
        this.subject7R = subject7R;
    }

    public Integer getSubject8R() {
        return subject8R;
    }

    public void setSubject8R(Integer subject8R) {
        this.subject8R = subject8R;
    }

    public Integer getSubject9R() {
        return subject9R;
    }

    public void setSubject9R(Integer subject9R) {
        this.subject9R = subject9R;
    }


    public eligible_ol() {
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


    public String getstream() {
        return stream;
    }

    public void setstream(String stream) {
        this.stream = stream;
    }


}

