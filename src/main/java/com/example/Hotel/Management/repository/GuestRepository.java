package com.example.Hotel.Management.repository;

import com.example.Hotel.Management.model.Guest;

import java.util.ArrayList;

public interface GuestRepository {

    Guest addGuest(Guest guest);

    ArrayList<Guest> getAllGuests();

     Guest getGuestById(int guestId);
}
