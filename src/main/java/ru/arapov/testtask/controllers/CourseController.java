package ru.arapov.testtask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.arapov.testtask.models.Course;
import ru.arapov.testtask.services.CourseService;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;


    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }
}
