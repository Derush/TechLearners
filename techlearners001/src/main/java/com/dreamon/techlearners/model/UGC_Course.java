package com.dreamon.techlearners.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "eligible_data")
public class UGC_Course {

    @Id
    private String id;
    private String name;
<<<<<<< HEAD
    private Map<String, Double> eligibility = new HashMap();
=======

    private Map<String, Integer> eligibility = new HashMap();
>>>>>>> 71b0e5153c0e1ffc40568f3414a639087a940849

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

    public Map<String, Integer> getEligibility() {
        return eligibility;
    }

    public void setEligibility(Map<String, Integer> eligibility) {
        this.eligibility = eligibility;
    }

    }
