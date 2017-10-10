package com.dreamon.techlearners.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "cutOffNew")
public class UGC_Zscore {

    @Id
    private String id;
    private String name;
    private String university;
    private Integer year;

    private Map<String, Integer> eligibility = new HashMap();

    private Map<String, Float> zscore = new HashMap();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Map<String, Integer> getEligibility() {
        return eligibility;
    }

    public void setEligibility(Map<String, Integer> eligibility) {
        this.eligibility = eligibility;
    }

    public Map<String, Float> getZscore() {
        return zscore;
    }

    public void setZscore(Map<String, Float> zscore) {
        this.zscore = zscore;
    }




}
