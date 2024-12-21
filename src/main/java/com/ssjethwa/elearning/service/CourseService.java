package com.ssjethwa.elearning.service;

import com.ssjethwa.elearning.model.Course;
import com.ssjethwa.elearning.model.ELearnUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    public List<Course> getAllCourses();

    public Course getCourseById(Long id);

    public Course createCourse(Course course);

    public void deleteCourse(Long id);

    public List<Course> getCoursesByCategory(String category);

    public List<Course> getCoursesByInstructor(ELearnUser instructor);
}
