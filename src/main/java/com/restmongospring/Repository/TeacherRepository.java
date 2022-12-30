package com.restmongospring.Repository;

import com.restmongospring.Domains.Teachers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends MongoRepository<Teachers,Integer> {
}
