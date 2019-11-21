package com.codeclan.lab.BookingSystem.repositories.CustomerRepository;

import com.codeclan.lab.BookingSystem.models.Course;
import com.codeclan.lab.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomersOnParticularCourse(Course course);

}
