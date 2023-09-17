package com.sprk1.sprk1.services;

import com.sprk1.sprk1.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements courseService {
    List<Course> list;
    public CourseServiceImpl(){
        list= new ArrayList<>();
        list.add(new Course(1,"Java","Beginner level course"));
        list.add(new Course(2,"Python","Medium level course"));
        list.add(new Course(3,"Cpp","Expert level course"));
        list.add(new Course(4,"HTML","Advance level course"));
    }
    public List<Course> getCourses() {
        return list;
    }
}
