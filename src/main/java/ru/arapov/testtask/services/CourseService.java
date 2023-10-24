package ru.arapov.testtask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arapov.testtask.models.Course;
import ru.arapov.testtask.repository.CourseRepository;

import java.util.List;
import java.util.Set;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public List<Course> saveCourses(List<Course> courses) {
        return repository.saveAll(courses);
    }

    public List<Course> getCourses() {
        return repository.findAll();
    }

    public Course getCourseById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Course getCourseByName(String name) {
        return repository.findByCourseName(name);
    }

    public String deleteCourse(int id) {
        repository.deleteById(id);
        return "course deleted: id = " + id;
    }

    public Course updateCourse(Course course) {
        Course existingCourse = repository.findById(course.getId()).orElse(null);
        existingCourse.setCourseName(course.getCourseName());
        existingCourse.setUserSet(course.getUserSet());
        return repository.save(existingCourse);
    }
}
