package com.dreamon.techlearners.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "uniCourseDetails")
public class UniCourse {

    @Id
    String id;
    String UniCode;
    String CourseName;
    String unviersityName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUniCode() {
        return UniCode;
    }

    public void setUniCode(String uniCode) {
        UniCode = uniCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getUnviersityName() {
        return unviersityName;
    }

    public void setUnviersityName(String unviersityName) {
        this.unviersityName = unviersityName;
    }
}
