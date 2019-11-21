package com.codeclan.lab.BookingSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "starRating")
    private int starRating;

    @Column(name = "date")
    private String date;

    @JsonIgnoreProperties(value = "courses")
    @ManyToMany
    @JoinTable(
            name = "bookings",
            joinColumns = { @JoinColumn(
                    name = "course_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "customer_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private List<Booking> bookings;

    public Course(String name, String town, int starRating, String date) {
        this. name = name;
        this.town = town.toLowerCase();
        this.starRating = starRating;
        this.date = date;
        this.bookings = new ArrayList<Booking>();
    }

    public Course() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town.toLowerCase();
    }

    public int getStarRating() {
        return this.starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    public int countBookings() {
        return this.bookings.size();
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
