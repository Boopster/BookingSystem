package com.codeclan.lab.BookingSystem.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String town;
    private int age;
    private List<Booking> bookings;

    public Customer(String name, String town, int age) {
        this.name = name;
        this.town = town.toLowerCase();
        this.age = age;
        this.bookings = new ArrayList<Booking>();
    }

    public Customer() {
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

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    public int countBookings(){
        return this.bookings.size();
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
