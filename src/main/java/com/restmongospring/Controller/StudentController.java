package com.restmongospring.Controller;

import com.restmongospring.Domains.Students;
import com.restmongospring.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServices studentServices;
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Students students){
        studentServices.addStudent(students);
        return "Student Added";
    }
    @GetMapping("/getStudent/{id}")
    public Students getStudent(@PathVariable int id){
        Students student=studentServices.getStudent(id);
        return student;
    }
    @GetMapping("/getAllStudents")
    public List<Students> getALLStudents(){
        List<Students> list=studentServices.getAllStudents();
        return list;
    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){
        studentServices.deleteStudent(id);
        return "Student has been Deleted";
    }
    @DeleteMapping("/deleteAllStudents")
    public String deleteAllStudent(){
        studentServices.deleteAllStudents();
        return "All Students has been Deleted";
    }
    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@RequestBody Students students,@PathVariable int id){
        studentServices.updateStudent(students,id);
        return "Student has been updated";
    }

}
