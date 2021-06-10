package com.example.courseregistration.controller;

import com.example.courseregistration.model.Course;
import com.example.courseregistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/deparmental_courses/{department}")
    public List<Course> fetchDepartmentalCourses(@PathVariable String department) {
        return courseService.fetchCoursesForDepartment(department);
    }

    @PostMapping("/create_course")
    public Course createCourse(@RequestBody Map<String, String> requestBody) {
        return courseService.createCourse(requestBody);
    }

    // add a put method here to update the units in the database
    @PutMapping("/update_course")
    public Course updateCourse(@RequestBody Map<String, String> requestBody) {
        return null; // finish
    }
}
