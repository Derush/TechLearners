package com.dreamon.techlearners.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Eligible")
public class eligible {

    private String id;

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

}
