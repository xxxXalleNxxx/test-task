package ru.arapov.testtask.models;

import jakarta.persistence.*;

@Entity
@Table(name = "lectures")
public class Lecture {

    @Id
    @Column(name = "lecture_id")
    private Integer lectureId;

    private String title;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;


    public Lecture() {

    }

    public Lecture(Integer lectureId, String title, Course course) {
        this.lectureId = lectureId;
        this.title = title;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
