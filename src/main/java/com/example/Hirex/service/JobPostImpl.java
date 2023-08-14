package com.example.Hirex.service;

import com.example.Hirex.entity.JobPost;
import com.example.Hirex.entity.Recruiter;
import com.example.Hirex.entity.request.JobPostRequest;
import com.example.Hirex.repository.JobPostRepository;
import com.example.Hirex.repository.RecruiterRepository;
import com.example.Hirex.utlil.ApiError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobPostImpl {
    @Autowired
    private RecruiterRepository recruiterRepository;

    @Autowired
    private JobPostRepository jobPostRepository;

    public boolean createJobPost(JobPostRequest jobPostRequest) throws ApiError {
        Optional<Recruiter> recruiter = recruiterRepository.findById(jobPostRequest.getRecruiter());
        JobPost jobPost = new JobPost();
        if (recruiter.isPresent()) {
            jobPost.setDescription(jobPostRequest.getDescription());
            jobPost.setTitle(jobPostRequest.getTitle());
            jobPost.setRecruiter(recruiter.get());
            jobPostRepository.save(jobPost);
            return true;
        }
        else{
            return false;
        }
    }
}

