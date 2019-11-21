package com.codeclan.lab.BookingSystem.repositories.CustomerRepository;

import com.codeclan.lab.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
