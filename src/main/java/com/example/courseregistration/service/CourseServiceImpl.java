package com.example.courseregistration.service;

import com.example.courseregistration.model.Course;
import com.example.courseregistration.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> fetchCoursesForDepartment(String department) {
        return courseRepository.getCoursesByDepartment(department);
    }

    @Override
    public Course createCourse(Map<String, String> courseDetails) {
        Course course = new Course();
        course.setTitle(courseDetails.get("title"));
        course.setCode(courseDetails.get("code"));
        course.setDepartment(courseDetails.get("department"));
        course.setFaculty(courseDetails.get("faculty"));
        course.setLecturerName(courseDetails.get("lecturerName"));
        // set units
        return courseRepository.save(course);
    }
}
