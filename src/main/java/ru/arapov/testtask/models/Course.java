package ru.arapov.testtask.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "course_name")
    private String courseName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_course",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<ApplicationUser> userSet = new HashSet<>();

    @OneToMany(mappedBy = "course")
    private Set<Lecture> lectures = new HashSet<Lecture>();

    public Course() {

    }

    public Course(Integer id, String courseName) {
        Id = id;
        this.courseName = courseName;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<ApplicationUser> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<ApplicationUser> userSet) {
        this.userSet = userSet;
    }

    public Set<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }
}
