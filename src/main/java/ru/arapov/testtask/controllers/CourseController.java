package ru.arapov.testtask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.arapov.testtask.models.Course;
import ru.arapov.testtask.services.CourseService;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @PostMapping("/addCourses")
    public List<Course> addCourses(@RequestBody List<Course> courses) {
        return service.saveCourses(courses);
    }

    @GetMapping("/courses")
    public List<Course> findAllProducts() {
        return service.getCourses();
    }

    @GetMapping("/courseById/{id}")
    public Course findCourseById(@PathVariable int id) {
        return service.getCourseById(id);
    }

    @GetMapping("/course/{courseName}")
    public Course findCourseByName(@PathVariable String courseName) {
        return service.getCourseByName(courseName);
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return service.updateCourse(course);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable int id) {
        return service.deleteCourse(id);
    }

}
