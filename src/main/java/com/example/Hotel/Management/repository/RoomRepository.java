package com.example.Hotel.Management.repository;


import com.example.Hotel.Management.model.Room;

import java.util.ArrayList;

public interface RoomRepository {


    Room addRoom(Room room);

//    Room addRoom(int roomNumber, String roomType, int price, String status);

    ArrayList<Room> getAllRooms();
    Room updateRoom(int roomId,Room room);

    void deleteRoom(int roomId);
     Room getRoomById(int roomId);

}
