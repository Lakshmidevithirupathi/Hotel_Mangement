package com.example.Hotel.Management.service;

import com.example.Hotel.Management.model.Guest;
import com.example.Hotel.Management.repository.GuestJpaRepository;
import com.example.Hotel.Management.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestService implements GuestRepository {

    @Autowired
    private GuestJpaRepository guestJpaRepository;

    @Override
    public Guest addGuest(Guest guest){
        guestJpaRepository.save(guest);
        return guest;
    }

    @Override
    public ArrayList<Guest> getAllGuests(){
        List<Guest> guestList=guestJpaRepository.findAll();
        ArrayList<Guest> guests=new ArrayList<>(guestList);
        return guests;
    }

    @Override
    public Guest getGuestById(int guestId){
        try {
            Guest guest = guestJpaRepository.findAll().get(guestId);
            return guest;
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }


}
