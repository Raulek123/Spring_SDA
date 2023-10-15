package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RoomReservation {
    private long roomId;
    private String roomName;
    private String roomNumber;
    private long guestId;
    private String firstName;
    private String lastName;
    private Date date;
}
