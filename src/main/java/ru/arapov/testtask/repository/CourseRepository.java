package ru.arapov.testtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arapov.testtask.models.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    Course findByCourseName(String courseName);
}
