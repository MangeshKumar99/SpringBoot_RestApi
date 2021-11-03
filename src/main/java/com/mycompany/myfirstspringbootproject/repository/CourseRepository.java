package com.mycompany.myfirstspringbootproject.repository;

import com.mycompany.myfirstspringbootproject.models.Course;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course,Integer> {
    
}
