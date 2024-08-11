package com.example.Hotel.Management.repository;


import com.example.Hotel.Management.model.Booking;
import com.example.Hotel.Management.model.Guest;
import com.example.Hotel.Management.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookingJpaRepository extends JpaRepository<Booking,Integer> {

    @Query("SELECT b.room FROM Booking b WHERE b.guest.id = :guestId")
    List<Room> findRoomsByGuestId(@Param("guestId") int guestId);

    @Query("SELECT b.guest FROM Booking b WHERE b.room.id = :roomId")
    List<Guest> findGuestsByRoomId(@Param("roomId") int roomId);
//    List<Booking> findByRoomAndCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual( room, checkInDate, checkOutDate);

//    List<Booking> findByRoomAndStartDateBeforeAndEndDateAfter(Room room, LocalDate checkInDate, LocalDate checkOutDate);

//    List<Booking> findByRoomIdAndCheckOutDateAfterAndCheckInDateBefore(int roomId, LocalDate checkInDate, LocalDate checkOutDate);

}

