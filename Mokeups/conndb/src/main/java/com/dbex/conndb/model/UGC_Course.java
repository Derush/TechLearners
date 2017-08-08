package com.dbex.conndb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "UGC")
public class UGC_Course {

    @Id
    private String id;
    private Map<String, Integer> eligibility = new HashMap();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Integer> getEligibility() {
        return eligibility;
    }

    public void setEligibility(Map<String, Integer> eligibility) {
        this.eligibility = eligibility;
    }
}
