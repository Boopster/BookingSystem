package com.codeclan.lab.BookingSystem.controllers;

import com.codeclan.lab.BookingSystem.models.Course;
import com.codeclan.lab.BookingSystem.models.Customer;
import com.codeclan.lab.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.lab.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

        @Autowired
        CustomerRepository customerRepository;

    @GetMapping(value="/courses/{course}")
        public List<Customer> findCustomersOnParticularCourse(@PathVariable Course course) {
            return customerRepository.findCustomersOnParticularCourse(course);

    }


}
