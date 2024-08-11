package com.example.Hotel.Management.controller;

import com.example.Hotel.Management.model.Booking;
import com.example.Hotel.Management.model.Guest;
import com.example.Hotel.Management.model.Room;
import com.example.Hotel.Management.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/add_booking")
    public Booking createBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }

    @GetMapping("/all_bookings")
    public ArrayList<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @GetMapping("/rooms/{guestId}")
    public ResponseEntity<List<Room>> getRoomsByGuestId(@PathVariable int guestId) {
        List<Room> rooms = bookingService.getRoomsByGuestId(guestId);
        return ResponseEntity.ok(rooms);
    }

    @GetMapping("/{roomId}/guests")
    public ResponseEntity<List<Guest>> getGuestsByRoomId(@PathVariable int roomId) {
        List<Guest> guests = bookingService.getGuestsByRoomId(roomId);
        return ResponseEntity.ok(guests);
    }





//
//    @GetMapping("/availability/{roomId}"){
//    public boolean isRoomAvailable(@PathVariable("roomId") int roomId,LocalDate checkInDate,LocalDate checkOutDate){
//        return bookingService.isRoomAvailable(roomId,checkInDate,checkOutDate);
//
//
//    }

//    @PostMapping
//    public ResponseEntity<String> bookRoom(@RequestParam int roomId,
//                                           @RequestParam LocalDate checkInDate,
//                                           @RequestParam LocalDate checkOutDate,
//                                           @RequestParam LocalDate bookingDate,
//                                           @RequestParam String status,
//                                           @RequestParam double totalAmount) {
//        String result = bookingService.bookRoom(roomId, checkInDate, checkOutDate, bookingDate,status,totalAmount);
//        if ("Room booked successfully".equals(result)) {
//            return new ResponseEntity<>(result, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
//        }
//    }

//
    @PostMapping("/bookings")
    public String bookRoom(@RequestBody Room room){
        return  bookingService.bookRoom(room);
    }




}
