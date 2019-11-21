package com.codeclan.lab.BookingSystem.repositories.BookingRepository;

import com.codeclan.lab.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
