package com.example.Hotel.Management.service;

import com.example.Hotel.Management.model.Guest;
import com.example.Hotel.Management.model.Room;
import com.example.Hotel.Management.repository.BookingJpaRepository;
import com.example.Hotel.Management.repository.GuestJpaRepository;
import com.example.Hotel.Management.repository.RoomJpaRepository;
import com.example.Hotel.Management.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService implements RoomRepository {

    @Autowired
    private RoomJpaRepository roomJpaRepository;

    @Autowired
    private BookingJpaRepository bookingJpaRepository;

    @Autowired
    private GuestJpaRepository guestJpaRepository;



//    @Override
//    public Room addRoom(Room roomDto) {
//        // Validate input
//        validateRoomDto(roomDto);
//
//        // Check if the room already exists
//        if (roomJpaRepository.existsByRoomNumber(roomDto.getRoomNumber())) {
//            throw new RuntimeException("Room with this number already exists.");
//        }
//
//        // Create Room entity from DTO
//        Room room = new Room();
//        room.setRoomId(roomDto.getRoomId());
//        room.setPrice(roomDto.getPrice());
//        room.setRoomNumber(roomDto.getRoomNumber());
//        room.setRoomType(roomDto.getRoomType());
//        room.setStatus(roomDto.getStatus());
//
//        // Save Room entity
//        return roomJpaRepository.save(room);
//    }

    @Override
    public Room addRoom(Room room) {
       roomJpaRepository.save(room);
       return room;

    }



    @Override
    public ArrayList<Room> getAllRooms(){
        List<Room> roomList=roomJpaRepository.findAll();
        ArrayList<Room> rooms=new ArrayList<>(roomList);
        return rooms;
    }

    @Override
    public Room updateRoom(int roomId,Room updatedRoom){
        return roomJpaRepository.findById(roomId)
                .map(room -> {
                    room.setRoomNumber(updatedRoom.getRoomNumber());
                    room.setRoomType(updatedRoom.getRoomType());
                    room.setStatus(updatedRoom.getStatus());
                    return roomJpaRepository.save(room);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteRoom(int roomId){
        try{
            roomJpaRepository.deleteById(roomId);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }

    @Override
    public Room getRoomById(int roomId){
        Room room=roomJpaRepository.findAll().get(roomId);
        return room;
    }


//    public Optional<Room> findAvailableRoom(int roomId) {
//        return roomJpaRepository.findByIdAndAvailable(roomId, true);
//    }
//
//    public void updateRoomAvailability(int roomId, boolean available) {
//        Room room = roomJpaRepository.findById(roomId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//        room.setAvailable(available);
//        roomJpaRepository.save(room);
//    }
}
