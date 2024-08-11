package com.example.Hotel.Management.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "invoiceid")
    private int invoiceId;

    @Column(name="bookingid")
    private int bookingId;

    @Column(name = "amount")
    private double amount;

    @Column(name="localdatetime")
    private LocalDateTime invoiceDate;

    @Column(name = "invoicenumber")
    private String invoiceNumber;

    // Getters and setters

    public int getInvoiceId(){
        return invoiceId;
    }
    public void setInvoiceId(int invoiceId){
        this.invoiceId=invoiceId;
    }

    public int getBookingId(){
        return bookingId;
    }

    public void setBookingId(int bookingId){
        this.bookingId=bookingId;
    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }

    public LocalDateTime getInvoiceDate(){
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate){
        this.invoiceDate=invoiceDate;
    }

    public String getInvoiceNumber(){
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber=invoiceNumber;
    }
}
