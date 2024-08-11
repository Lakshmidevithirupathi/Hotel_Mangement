package com.example.Hotel.Management.repository;


import com.example.Hotel.Management.model.Booking;
import com.example.Hotel.Management.model.Guest;
import com.example.Hotel.Management.model.Room;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface BookingRepository {
    Booking createBooking(Booking booking);

    ArrayList<Booking> getAllBookings();

    List<Room> getRoomsByGuestId(int guestId);

    List<Guest> getGuestsByRoomId(int roomId);

//    String bookRoom(Booking booking);

    String bookRoom(Room room);

}
