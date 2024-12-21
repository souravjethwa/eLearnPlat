package com.ssjethwa.elearning.repository;

import com.ssjethwa.elearning.model.Course;
import com.ssjethwa.elearning.model.ELearnUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByCategory(String category);
    List<Course> findByInstructor(ELearnUser instructor);
}
