package com.example.Hotel.Management.controller;

import com.example.Hotel.Management.model.Guest;
import com.example.Hotel.Management.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GuestController {

    @Autowired
    private GuestService guestService;

    @PostMapping("/add_guest")
    public Guest addGuest(@RequestBody Guest guest){
        return guestService.addGuest(guest);
    }

    @GetMapping("/all_guests")
    public ArrayList<Guest> getAllGuests(){
        return  guestService.getAllGuests();
    }

    @GetMapping("/get_guest/{guestId}")
    public Guest getGuestById(@PathVariable("guestId") int guestId){
        return guestService.getGuestById(guestId);
    }

    @PutMapping("/update_guest/{guestId}")
    public Guest updateGuest(@PathVariable("guestId") int guestId,@RequestBody Guest guest){
        return guestService.updateGuest(guestId,guest);
    }

    @DeleteMapping("delete_guest/{guestId}")
    public void deleteGuest(@PathVariable int guestId){
         guestService.deleteGuest(guestId);
    }

}
