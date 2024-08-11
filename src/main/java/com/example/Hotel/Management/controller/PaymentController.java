package com.example.Hotel.Management.controller;


import com.example.Hotel.Management.model.Payment;
import com.example.Hotel.Management.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add_payment")

    public Payment addPayment(@RequestBody Payment payment){
        return paymentService.addPayment(payment);
    }

    @PutMapping("/update_payment/{bookingId}")
    public Payment updatePayment(@PathVariable("bookingId") int bookingId,@RequestBody Payment payment){
        return  paymentService.updatePayment(bookingId,payment);
    }

    @GetMapping("/all_payments")

    public ArrayList<Payment> getAllPayements(){
        return paymentService.getAllPayements();
    }



}
