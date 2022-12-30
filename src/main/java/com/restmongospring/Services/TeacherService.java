package com.restmongospring.Services;

import com.restmongospring.Domains.Students;
import com.restmongospring.Domains.Teachers;
import com.restmongospring.Repository.StudentRepository;
import com.restmongospring.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    //Adding Teacher
    public void addTeacher(Teachers teacher){
        teacherRepository.insert(teacher);
    }
    //Getting Single Teacher
    public Teachers getTeacher(int teacherId){
        Optional<Teachers> optional=teacherRepository.findById(teacherId);
        Teachers teacher=optional.get();
        return teacher;
    }
    //Getting All Teachers
    public List<Teachers> getAllTeachers(){
        List<Teachers> list=teacherRepository.findAll();
        return list;
    }
    //Deleting Specific Teacher
    public void  deleteTeacher(int id){
        Optional<Teachers> optional=teacherRepository.findById(id);
        Teachers teacher=optional.get();
        teacherRepository.delete(teacher);
    }
    //Deleting All Teacher
    public void deleteAllTeachers(){
        teacherRepository.deleteAll();
    }
    //Updating Teacher
    public void updateTeacher(Teachers teacher,int id){
        Optional<Teachers> optional=teacherRepository.findById(id);
        Teachers teacher1=optional.get();
        teacher1.setTeacherName(teacher.getTeacherName());
        teacher1.setTeacherName(teacher.getTeacherAddress());
        teacherRepository.save(teacher1);
    }
}
