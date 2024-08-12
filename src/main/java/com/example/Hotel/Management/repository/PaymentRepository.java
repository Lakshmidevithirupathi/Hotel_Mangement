package com.example.Hotel.Management.repository;

import com.example.Hotel.Management.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


public interface PaymentRepository {
    Payment addPayment(Payment payment);

    Payment updatePayment(int bookingId, Payment payment);

    ArrayList<Payment> getAllPayements();

    void deletePayment(int paymentId);
}