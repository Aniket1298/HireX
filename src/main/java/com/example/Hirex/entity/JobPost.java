package com.example.Hirex.entity;

import jakarta.persistence.*;

import java.util.Optional;


@Entity
@Table(name = "job_post")
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruiter_email")
    private Recruiter recruiter;

    // Constructors, getters, and setters

    public JobPost() {
    }

    public JobPost(String title, String description, Recruiter recruiter) {
        this.title = title;
        this.description = description;
        this.recruiter = recruiter;
    }

    // Other fields, constructors, getters, and setters

    // Getters and setters for the fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Recruiter getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }
}