package com.restmongospring.Repository;

import com.restmongospring.Domains.Courses;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Courses,Integer> {
}
