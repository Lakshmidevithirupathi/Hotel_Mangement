package com.example.Hotel.Management.repository;


import com.example.Hotel.Management.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomJpaRepository extends JpaRepository<Room,Integer> {
    List<Room> findByIsAvailableTrue();

//    Optional<Room> findByIdAndAvailable(int roomId, boolean available);

}
