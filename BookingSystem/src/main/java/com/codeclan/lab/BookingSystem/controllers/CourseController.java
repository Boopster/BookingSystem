package com.codeclan.lab.BookingSystem.controllers;

import com.codeclan.lab.BookingSystem.models.Course;
import com.codeclan.lab.BookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "starRating/{starRating}")
    public List<Course> getByStarRating(@PathVariable int starRating) {
        return courseRepository.getByStarRating(starRating);
    }



//    @GetMapping(value="distillery/{id}/age/{age}")
//    public List<Whisky> getByDistilleryIdAndAge(@PathVariable Long id, @PathVariable int age) {
//        return whiskyRepository.getByDistilleryIdAndAge(id, age);
//    }
//
//    @GetMapping(value="region/{region}")
//    public List<Whisky> getByDistilleryRegion(@PathVariable String region) {
//        return whiskyRepository.getByDistilleryRegion(region);
//    }



}