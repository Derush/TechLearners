package com.dreamon.techlearners.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "unidetails")
public class uniDetails {

    @Id
    String id;
    String universityId;
    String unviersityName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public String getUnviersityName() {
        return unviersityName;
    }

    public void setUnviersityName(String unviersityName) {
        this.unviersityName = unviersityName;
    }
}
