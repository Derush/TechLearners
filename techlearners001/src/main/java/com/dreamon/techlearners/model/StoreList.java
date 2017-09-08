package com.dreamon.techlearners.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "listretrive")
public class StoreList {


    private String id;
    private String name;

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
}
