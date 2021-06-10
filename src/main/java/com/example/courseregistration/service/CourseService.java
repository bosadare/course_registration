package com.example.courseregistration.service;

import com.example.courseregistration.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CourseService {
    List<Course> fetchCoursesForDepartment(String department);

    Course createCourse(Map<String, String> courseDetails);
}
