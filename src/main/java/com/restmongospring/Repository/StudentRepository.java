package com.restmongospring.Repository;

import com.restmongospring.Domains.Students;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Students,Integer> {
}
