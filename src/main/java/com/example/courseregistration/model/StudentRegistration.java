package com.example.courseregistration.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StudentRegistration {
    @Id
    @GeneratedValue
    private Long id;

    // A student wants to register his courses
    // create a new controller,
    // create a service interface and service implementation (repeat the same processes for the previous examples)
    // create a post method /register_courses in the new  controller
    // student will pass a list of course codes for the system to register, department, name, level, matric number, academic_year
    // verify that the course that he wants to take is between 9 and 12 units, he has not more than 1 registration for an academic year
    // { response: registration successful, reason: null }, and  { response: registration failed, reason: 'give reason' }
}
