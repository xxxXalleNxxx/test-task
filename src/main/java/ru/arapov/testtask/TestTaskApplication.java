package ru.arapov.testtask;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.provider.HibernateUtils;
import ru.arapov.testtask.models.ApplicationUser;
import ru.arapov.testtask.models.Course;
import ru.arapov.testtask.models.Lecture;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class TestTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTaskApplication.class, args);
    }
}
