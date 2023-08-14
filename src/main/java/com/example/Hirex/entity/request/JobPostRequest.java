package com.example.Hirex.entity.request;

import com.example.Hirex.entity.Recruiter;

public class JobPostRequest {
    private String title;
    private String description;

    @Override
    public String toString() {
        return "JobPostRequest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", recruiter=" + recruiter +
                '}';
    }

    private long recruiter;

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

    public long getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(long recruiter) {
        this.recruiter = recruiter;
    }
}
