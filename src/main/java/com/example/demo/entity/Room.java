package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
@Data
public class Room {
    //  ROOM_ID BIGSERIAL PRIMARY KEY,
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //w Oracle jest sequence
    @Column(name = "ROOM_ID")
    private long id;

    //  NAME VARCHAR(16) NOT NULL,
    @Column(name = "NAME")
    private String name;
    //  ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;
    //  BED_INFO CHAR(2) NOT NULL
    @Column(name = "BED_INFO")
    private String bedInfo;
}
