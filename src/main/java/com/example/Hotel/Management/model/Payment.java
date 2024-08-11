package com.example.Hotel.Management.model;

import jakarta.persistence.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
//@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentid")
    private int paymentId;

//    @Column(name = "bookingid")
//    private int bookingId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "paymentmethod")
    private String paymentMethod;  // e.g., Credit Card, Cash, etc.

    @Column(name = "paymentdate")
    private LocalDateTime paymentDate;

    @OneToOne
//    @Column(name = "booking")
    @JoinColumn(name = "bookingid")
    private Booking booking;
//    // Getters and setters

    public int getPaymentId(){
        return paymentId;
    }
    public void setPaymentId(int paymentId){
        this.paymentId=paymentId;
    }

//    public int getBookingId(){
//        return bookingId;
//    }
//
//    public void setBookingId(int bookingId){
//        this.bookingId=bookingId;
//    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }

    public LocalDateTime getPaymentDate(){
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate){
        this.paymentDate=paymentDate;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    public Booking getBooking(){
        return booking;
    }
    public void setBooking(Booking booking){
        this.booking=booking;
    }


}
