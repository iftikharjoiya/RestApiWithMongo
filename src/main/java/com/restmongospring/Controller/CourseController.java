package com.restmongospring.Controller;

import com.restmongospring.Domains.Courses;
import com.restmongospring.Domains.Students;
import com.restmongospring.Services.CourseServices;
import com.restmongospring.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CourseController {
    @Autowired
    private CourseServices courseServices;
    @PostMapping("/addCourse")
    public String addCourse(@RequestBody Courses course){
        courseServices.addCourse(course);
        return "Course Added";
    }
    @GetMapping("/getCourse/{id}")
    public Courses getCourse(@PathVariable int id){
        Courses course=courseServices.getCourse(id);
        return course;
    }
    @GetMapping("/getAllCourses")
    public List<Courses> getAllCourses(){
        List<Courses> list=courseServices.getAllCourses();
        return list;
    }
    @DeleteMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable int id){
        courseServices.deleteCourse(id);
        return "Course has been Deleted";
    }
    @DeleteMapping("/deleteAllCourses")
    public String deleteAllCourses(){
        courseServices.deleteAllCourses();
        return "All Courses has been Deleted";
    }
    @PutMapping("/updateCourse/{id}")
    public String updateCourse(@RequestBody Courses courses,@PathVariable int id){
        courseServices.updateCourse(courses,id);
        return "Course has been updated";
    }
}
