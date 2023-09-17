package com.sprk1.sprk1.controller;

import com.sprk1.sprk1.entity.Course;
import com.sprk1.sprk1.services.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private courseService courseService;
    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }
    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getCourses();
    }
}
