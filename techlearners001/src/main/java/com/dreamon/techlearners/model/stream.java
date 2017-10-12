package com.dreamon.techlearners.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "info")
public class stream {
    @Id
    private String id;

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

    private String name;
    private Map<String, Integer> eligibility = new HashMap();


}
