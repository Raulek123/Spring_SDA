package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "RESERVATION")
@Data
public class Reservation {
    //CREATE TABLE RESERVATION(
    //  RESERVATION_ID BIGSERIAL PRIMARY KEY,
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;
    //  ROOM_ID BIGINT NOT NULL,
    @Column(name = "ROOM_ID")
    private long roomId;
    //  GUEST_ID BIGINT NOT NULL,
    @Column(name = "GUEST_ID")
    private long guestId;
    //  RES_DATE DATE
    @Column(name = "RES_DATE")
    private Date reservationDate;
    //);

}
