package com.restmongospring.Controller;

import com.restmongospring.Domains.Students;
import com.restmongospring.Domains.Teachers;
import com.restmongospring.Services.StudentServices;
import com.restmongospring.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping("/addTeacher")
    public String addTeacher(@RequestBody Teachers teacher){
        teacherService.addTeacher(teacher);
        return "Teacher Added";
    }
    @GetMapping("/getTeacher/{id}")
    public Teachers getTeacher(@PathVariable int id){
        Teachers teacher=teacherService.getTeacher(id);
        return teacher;
    }
    @GetMapping("/getAllTeachers")
    public List<Teachers> getALLTeachers(){
        List<Teachers> list=teacherService.getAllTeachers();
        return list;
    }
    @DeleteMapping("/deleteTeacher/{id}")
    public String deleteTeacher(@PathVariable int id){
        teacherService.deleteTeacher(id);
        return "Teacher has been Deleted";
    }
    @DeleteMapping("/deleteAllTeachers")
    public String deleteAllTeachers(){
        teacherService.deleteAllTeachers();
        return "All Teachers has been Deleted";
    }
    @PutMapping("/updateTeacher/{id}")
    public String updateStudent(@RequestBody Teachers teachers,@PathVariable int id){
        teacherService.updateTeacher(teachers,id);
        return "Teachers has been updated";
    }
}
