package com.restmongospring.Domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Courses {
    @Id
    private int courseId;
    private String courseName;
    private String couserDuration;

    public Courses(int courseId, String courseName, String couserDuration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.couserDuration = couserDuration;
    }

    public Courses() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCouserDuration() {
        return couserDuration;
    }

    public void setCouserDuration(String couserDuration) {
        this.couserDuration = couserDuration;
    }
}
