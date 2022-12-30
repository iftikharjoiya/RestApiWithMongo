package com.restmongospring.Services;

import com.restmongospring.Domains.Students;
import com.restmongospring.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {
    @Autowired
private StudentRepository studentRepository;
    //Adding Student
    public void addStudent(Students student){
        studentRepository.insert(student);
    }
    //Getting Single student
    public Students getStudent(int studentId){
        Optional<Students> optional=studentRepository.findById(studentId);
        Students students=optional.get();
        return students;
    }
    //Getting All Students
    public List<Students> getAllStudents(){
        List<Students> list=studentRepository.findAll();
        return list;
    }
    //Deleting Specific Student
    public void  deleteStudent(int id){
        Optional<Students> optional=studentRepository.findById(id);
        Students student=optional.get();
        studentRepository.delete(student);
    }
    //Deleting All Students
    public void deleteAllStudents(){
        studentRepository.deleteAll();
    }
    //Updating Student
    public void updateStudent(Students student,int id){
        Optional<Students> optional=studentRepository.findById(id);
        Students student1=optional.get();
        student1.setStudentName(student.getStudentName());
        student1.setStudentAddress(student.getStudentAddress());
        studentRepository.save(student1);
    }
}
