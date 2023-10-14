package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "GUEST")
@Data
public class Guest {
    //CREATE TABLE GUEST(
    //  GUEST_ID BIGSERIAL PRIMARY KEY,
    @Id
    @Column(name = "GUEST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long guestId;

    //  FIRST_NAME VARCHAR(64),
    @Column(name = "FIRST_NAME")
    private String firstName;
    //  LAST_NAME VARCHAR(64),
    @Column(name = "LAST_NAME")
    private String lastName;
    //  EMAIL_ADDRESS VARCHAR(64),
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    //  ADDRESS VARCHAR(64),
    @Column(name = "ADDRESS")
    private String address;
    //  COUNTRY VARCHAR(32),
    @Column(name = "COUNTRY")
    private String country;
    //  STATE VARCHAR(12),

    @Column(name = "STATE")
    private String state;
    //  PHONE_NUMBER VARCHAR(24)

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

}
