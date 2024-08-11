package com.example.Hotel.Management.service;


import com.example.Hotel.Management.model.Booking;
import com.example.Hotel.Management.model.Payment;
import com.example.Hotel.Management.repository.BookingJpaRepository;
import com.example.Hotel.Management.repository.PaymentJpaRepository;
import com.example.Hotel.Management.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService implements PaymentRepository {

    @Autowired
    private PaymentJpaRepository paymentJpaRepository;


    @Autowired
    private BookingJpaRepository bookingJpaRepository;

    @Override
    public Payment addPayment(Payment payment){

        return paymentJpaRepository.save(payment);

    }

    @Override

    public Payment updatePayment(int bookingId, Payment payment){
        Booking booking=bookingJpaRepository.findAll().get(bookingId);
        System.out.println(booking.getTotalAmount());

        return payment;
    }

    @Override
    public ArrayList<Payment> getAllPayements(){
        List<Payment> paymentList=paymentJpaRepository.findAll();
        ArrayList<Payment> payments=new ArrayList<>(paymentList);
        return payments;
    }

}
