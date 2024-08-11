package com.example.Hotel.Management.controller;



import com.example.Hotel.Management.model.Room;
import com.example.Hotel.Management.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/add_room")
    public Room addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }

    @GetMapping("/all_rooms")
    public ArrayList<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @PutMapping("/update_room/{roomId}")
    public Room updateRoom(@PathVariable("roomId") int roomId,@RequestBody Room room){
        return roomService.updateRoom(roomId,room);
    }
    @DeleteMapping("/delete_room/{roomId}")
    public void deleteRoom(@PathVariable int roomId){
        roomService.deleteRoom(roomId);
    }

    @GetMapping("/get_room/{roomId}")
    public Room getRoomById(@PathVariable("roomId") int roomId){
        return roomService.getRoomById(roomId);
    }


}
