package com.example.Hotel.Management.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="guestid")
    private int guestId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

//    @OneToMany(mappedBy = "guest")
//    @JsonManagedReference
//    private List<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "roomid")
    private Room room;


    public int getGuestId(){
        return guestId;
    }

    public void setGuestId(int guestId){
        this.guestId=guestId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

//    public List<Booking> getBookings(){
//        return  bookings;
//    }
//
//    public void setBookings(List<Booking> bookings){
//        this.bookings=bookings;
//    }

    public Room getRoom(){
        return room;
    }

    public void setRoom(Room room){
        this.room=room;
    }

}
