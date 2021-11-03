package com.mycompany.myfirstspringbootproject.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Course")
public class Course {
    @Id
    private String courseName;
    private Integer courseId;
    private String instructorName;
    public Course(String courseName, Integer courseId, String instructorName) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.instructorName = instructorName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public  Integer getCourseId() {
        return courseId;
    }
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName + ", instructorName=" + instructorName
                + "]";
    }
    
    
}
