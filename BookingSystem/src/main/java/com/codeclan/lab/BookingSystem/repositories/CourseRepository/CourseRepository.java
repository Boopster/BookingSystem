package com.codeclan.lab.BookingSystem.repositories.CourseRepository;

import com.codeclan.lab.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> getByStarRating(int starRating);
}
