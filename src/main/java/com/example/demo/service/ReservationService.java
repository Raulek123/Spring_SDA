package com.example.demo.service;

import com.example.demo.repository.GuestRepository;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }


}
