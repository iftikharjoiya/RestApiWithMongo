package com.restmongospring.Services;

import com.restmongospring.Domains.Courses;
import com.restmongospring.Domains.Students;
import com.restmongospring.Repository.CourseRepository;
import com.restmongospring.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServices {
    @Autowired
    private CourseRepository courseRepository;
    //Adding Course
    public void addCourse(Courses course){
        courseRepository.insert(course);
    }
    //Getting Single Course
    public Courses getCourse(int couserId){
        Optional<Courses> optional=courseRepository.findById(couserId);
        Courses course=optional.get();
        return course;
    }
    //Getting All Courses
    public List<Courses> getAllCourses(){
        List<Courses> list=courseRepository.findAll();
        return list;
    }
    //Deleting Specific Course
    public void  deleteCourse(int id){
        Optional<Courses> optional=courseRepository.findById(id);
        Courses course=optional.get();
        courseRepository.delete(course);
    }
    //Deleting All Courses
    public void deleteAllCourses(){
        courseRepository.deleteAll();
    }
    //Updating Course
    public void updateCourse(Courses course,int id){
        Optional<Courses> optional=courseRepository.findById(id);
        Courses course1=optional.get();
        course1.setCourseName(course.getCourseName());
        course1.setCouserDuration(course.getCouserDuration());
        courseRepository.save(course1);
    }
}
