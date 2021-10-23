package com.mycompany.myfirstspringbootproject.controller;

import java.util.List;

import com.mycompany.myfirstspringbootproject.models.Course;
import com.mycompany.myfirstspringbootproject.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course")
    public Course getCourse() {
        return courseService.getCourse();
    }

    @GetMapping("/allcourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/course/{cid}")
    public Course getIndividualCourse(Integer cId) {

        return courseService.getIndividualCourse(cId);

    }

    @PutMapping("/course/{cid}")
    public List<Course> updateIndividualCourse(Integer cId, @RequestBody Course updatedCourse) {

        return courseService.updateIndividualCourse(cId, updatedCourse);
    }

    @DeleteMapping("/course/{cid}")
    public List<Course> deleteIndividualCourse(@PathVariable("cid") Integer cId) {

        return courseService.deleteIndividualCourse(cId);
    }

    @PostMapping("/addcourse")
    public List<Course> addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

}
