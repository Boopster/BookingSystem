package com.codeclan.lab.BookingSystem.components;

import com.codeclan.lab.BookingSystem.models.Booking;
import com.codeclan.lab.BookingSystem.models.Course;
import com.codeclan.lab.BookingSystem.models.Customer;
import com.codeclan.lab.BookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.lab.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.lab.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Course course1 = new Course("Professional Software Development", "Glasgow", "06-01-20");
        courseRepository.save(course1);

        Course course2 = new Course("Professional Software Development", "Edinburgh", "13-01-20");
        courseRepository.save(course2);

        Customer customer1 = new Customer("Jane Doe", "Glasgow", 30);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("John Doe", "Edinburgh", 35);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Jane Smith", "Glasgow", 32);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("John Smith", "Edinburgh", 31);
        customerRepository.save(customer4);

        Booking booking1 = new Booking(course1,customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking(course2,customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking(course1,customer3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking(course2,customer4);
        bookingRepository.save(booking4);
    }
}

