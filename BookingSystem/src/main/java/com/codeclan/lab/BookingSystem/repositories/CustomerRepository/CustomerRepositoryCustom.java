package com.codeclan.lab.BookingSystem.repositories.CustomerRepository;

import com.codeclan.lab.BookingSystem.models.Course;
import com.codeclan.lab.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersOnParticularCourse(Course course);

}
