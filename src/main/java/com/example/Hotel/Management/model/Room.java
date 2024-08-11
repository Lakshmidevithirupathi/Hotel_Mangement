package com.example.Hotel.Management.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="roomid")
    private int roomId;

    @Column(name="roomnumber")
    private int roomNumber;

    @Column(name="roomtype")
    private String roomType;

    @Column(name = "price")
    private int price;

    @Column(name  ="status")
    private String status;

//    @ManyToOne
//    @JoinColumn(name="guestid")
//    private Guest guest;


    @Column(name = "isavailable")
    private boolean isAvailable;


    public int getRoomId(){
        return roomId;
    }

    public void setRoomId(int roomId){
        this.roomId=roomId;
    }

    public int getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber=roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
        this.roomType=roomType;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }

//    public Guest getGuest(){
//        return guest;
//    }
//
//    public void setGuest(Guest guest){
//        this.guest=guest;
//    }

    public boolean getAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }



}
