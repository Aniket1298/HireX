package com.example.Hirex.controller;

import com.example.Hirex.entity.RecruiterRequest;
import com.example.Hirex.entity.request.JobPostRequest;
import com.example.Hirex.service.JobPostImpl;
import com.example.Hirex.utlil.ApiError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/jobpost")
public class JobPostController {
    @Autowired
    private JobPostImpl jobPostService;
    @PostMapping("/")
    public ResponseEntity<?> createJobPost(@RequestBody JobPostRequest request) throws ApiError {
        System.out.println("jobpost");
        try{
            if(jobPostService.createJobPost(request)==true){
                return ResponseEntity.status(HttpStatus.CREATED).body("Successfully Created");
            }
            else{
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to Create");
            }
        }
        catch (ApiError e){
            return ResponseEntity.status(e.getStatus()).body(e);
        }
    }
}
