package com.codeclan.lab.BookingSystem.models;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private String town;
    private int starRating;
    private String date;
    private List<Booking> bookings;

    public Course(String name, String town) {
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
