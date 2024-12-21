package com.ssjethwa.elearning.controller;

import com.ssjethwa.elearning.model.Course;
import com.ssjethwa.elearning.model.ELearnUser;
import com.ssjethwa.elearning.service.CourseService;
import com.ssjethwa.elearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    UserService userService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @GetMapping("/category/{category}")
    public List<Course> getCoursesByCategory(@PathVariable String category) {
        return courseService.getCoursesByCategory(category);
    }

    @GetMapping("/instructor/{instructorId}")
    public List<Course> getCoursesByInstructor(@PathVariable Long instructorId) {
        // Instructor ID is a user ID, so retrieve user and find their courses
        ELearnUser instructor = userService.getUserById(instructorId);
        return courseService.getCoursesByInstructor(instructor);
    }
}
