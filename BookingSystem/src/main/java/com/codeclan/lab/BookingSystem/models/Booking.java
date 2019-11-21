package com.codeclan.lab.BookingSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties("bookings")
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JsonIgnoreProperties("bookings")
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public Booking(Course course, Customer customer) {
        this.course = course;
        this.customer = customer;
    }

    public Booking() {
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse_id(Course course) {
        this.course = course;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
