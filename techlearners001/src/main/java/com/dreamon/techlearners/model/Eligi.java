package com.dreamon.techlearners.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "Eligi")
public class Eligi {

    private String id;

    private Map<String, Integer> eli1 = new HashMap();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Integer> geteli1() {
        return eli1;
    }

    public void seteli1(Map<String, Integer> eli1) {
        this.eli1 = eli1;
    }
}
