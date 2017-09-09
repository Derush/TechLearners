package com.dreamon.techlearners.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "Zscore")
public class UGC_Zscore{

        @Id
        private String id;
        private String name;

        private Map<String, Integer> eligibility = new HashMap();

        private Map<String, Float> Zscore = new HashMap();

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

    public Map<String, Float> getZscore() {
        return Zscore;
    }

    public void setZscore(Map<String, Float> zscore) {
        Zscore = zscore;
    }
}
