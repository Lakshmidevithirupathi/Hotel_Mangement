package com.example.Hotel.Management.repository;

import com.example.Hotel.Management.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
    // Add custom queries if needed
}