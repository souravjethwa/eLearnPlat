package com.ssjethwa.elearning.service;

import com.ssjethwa.elearning.model.Course;
import com.ssjethwa.elearning.model.ELearnUser;
import com.ssjethwa.elearning.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        Course course = getCourseById(id);
        courseRepository.delete(course);
    }

    @Override
    public List<Course> getCoursesByCategory(String category) {
        return courseRepository.findByCategory(category);
    }

    @Override
    public List<Course> getCoursesByInstructor(ELearnUser instructor) {
        return courseRepository.findByInstructor(instructor);
    }
}
