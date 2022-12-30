package com.restmongospring.Domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teachers {
    @Id
    private int teacherId;
    private String teacherName;
    private String teacherAddress;

    public Teachers(int teacherId, String teacherName, String teacherAddress) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
    }

    public Teachers() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }
}
