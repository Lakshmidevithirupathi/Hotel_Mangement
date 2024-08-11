package com.example.Hotel.Management.repository;

import com.example.Hotel.Management.model.Guest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestJpaRepository extends JpaRepository<Guest, Integer> {
}
