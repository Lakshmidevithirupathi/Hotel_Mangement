package com.example.Hotel.Management.service;

import com.example.Hotel.Management.exception.RoomNotAvailableException;
import com.example.Hotel.Management.exception.RoomNotFoundException;
import com.example.Hotel.Management.model.Booking;
import com.example.Hotel.Management.model.Guest;
import com.example.Hotel.Management.model.Room;
import com.example.Hotel.Management.repository.BookingJpaRepository;
import com.example.Hotel.Management.repository.BookingRepository;
import com.example.Hotel.Management.repository.GuestJpaRepository;
import com.example.Hotel.Management.repository.RoomJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Hotel.Management.model.Payment;
import com.example.Hotel.Management.service.RoomService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService implements BookingRepository {


    @Autowired
    private BookingJpaRepository bookingJpaRepository;

    @Autowired
    private GuestJpaRepository guestJpaRepository;

    @Autowired
    private RoomJpaRepository roomJpaRepository;

    @Override
    public Booking createBooking(Booking booking) {
        // Validate guest and room existence
        bookingJpaRepository.save(booking);
        return booking;
    }

    @Override
    public ArrayList<Booking> getAllBookings(){
        List<Booking> bookingList=bookingJpaRepository.findAll();
//        Booking booking=new Booking();
        ArrayList<Booking> bookings=new ArrayList<>(bookingList);

        return bookings;

    }

    @Override
    public List<Room> getRoomsByGuestId(int guestId) {
        return bookingJpaRepository.findRoomsByGuestId(guestId);
    }

    @Override
    public List<Guest> getGuestsByRoomId(int roomId) {
        return bookingJpaRepository.findGuestsByRoomId(roomId);
    }





    @Override
    public String bookRoom(Room room){
         Room newRoom = roomJpaRepository.findById(room.getRoomId()).orElseThrow(() -> new RoomNotFoundException("Room not found"));

         if (!newRoom.getAvailable()) {
            return "Room is not available";
        }

        // Create and save the new booking
        Booking booking=new Booking();
        booking.setCheckInDate(booking.getCheckInDate());
        booking.setCheckOutDate(booking.getCheckOutDate());
        booking.setBookingDate(booking.getBookingDate());
        booking.setStatus(booking.getStatus());
        booking.setTotalAmount(booking.getTotalAmount());
//        bookingJpaRepository.save(booking);

        // Mark room as not available
        room.setAvailable(false);
        roomJpaRepository.save(room);
        booking.setRoom(room);

        bookingJpaRepository.save(booking);


//        return "Room booked successfully";
        return "Room booked successfully";

    }




}
