package com.mycompany.myfirstspringbootproject.services;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.myfirstspringbootproject.models.Course;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class CourseService {
    private List<Course> allcourses = new ArrayList<>();

    public CourseService() {
        allcourses.add(new Course("Angular", 101, "Mangesh"));
        allcourses.add(new Course("React", 102, "Hitesh"));
        allcourses.add(new Course("Vue", 103, "Shergill"));

    }

    @GetMapping("/course")
    public Course getCourse() {
        return new Course("SpringBoot", 101, "Hitesh");
    }

    @GetMapping("/allcourses")
    public List<Course> getAllCourses() {
        return allcourses;
    }

    @GetMapping("/course/{cid}")
    public Course getIndividualCourse(Integer cId) {

        for (int i = 0; i < allcourses.size(); i++) {
            if (allcourses.get(i).getCourseId() == cId) {
                return allcourses.get(i);
            } else if (allcourses.get(i).getCourseId() != cId) {
                return new Course("not found", 404, "not found");
            }
        }
        return null;

        // Course individualCourse=allcourses.stream().
        // filter(course ->cId.equals(course.getCourseId())).
        // findAny().
        // orElse(new Course("not found",404,"notfound"));
        // return individualCourse;

    }

    @PutMapping("/course/{cid}")
    public List<Course> updateIndividualCourse(Integer cId, Course updatedCourse) {

        for (int i = 0; i < allcourses.size(); i++) {
            if (allcourses.get(i).getCourseId() == cId) {
                allcourses.set(i, updatedCourse);
                return allcourses;
            }
        }
        return null;
    }

    @DeleteMapping("/course/{cid}")
    public List<Course> deleteIndividualCourse(Integer cId) {

        for (int i = 0; i < allcourses.size(); i++) {
            if (allcourses.get(i).getCourseId() == cId) {
                allcourses.remove(i);
                return allcourses;
            }
        }
        return null;
    }

    @PostMapping("/addcourse")
    public List<Course> addCourse(Course course) {
        allcourses.add(course);
        return allcourses;
    }
}
