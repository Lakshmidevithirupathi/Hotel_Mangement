package com.example.Hotel.Management.repository;

import com.example.Hotel.Management.model.Payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentJpaRepository extends JpaRepository<Payment,Integer> {
}
