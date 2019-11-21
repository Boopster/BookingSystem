package com.codeclan.lab.BookingSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_id")
    private Long course_id;

    @Column(name = "customer_id")
    private Long customer_id;

    public Booking(Long course_id, Long customer_id) {
        this.course_id = course_id;
        this.customer_id = customer_id;
    }

    public Booking() {
    }

    public Long getCourse_id() {
        return this.course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getCustomer_id() {
        return this.customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }
}
