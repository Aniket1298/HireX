package com.example.Hirex.repository;

import com.example.Hirex.entity.JobPost;
import com.example.Hirex.entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostRepository extends JpaRepository<JobPost, Long> {
    JobPost findByRecruiter(Recruiter recruiter);
}
