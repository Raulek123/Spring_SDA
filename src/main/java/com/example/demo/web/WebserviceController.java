package com.example.demo.web;

import com.example.demo.entity.Guest;
import com.example.demo.entity.Room;
import com.example.demo.entity.RoomReservation;
import com.example.demo.service.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WebserviceController {
    private final ReservationService reservationService;

    public WebserviceController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/guests")
    public List<Guest> getGuests(){
        return this.reservationService.getHotelGuests();
    }

    @GetMapping("/rooms")
    public List<Room> getRooms(){
        return this.reservationService.getRooms();
    }

    public List<RoomReservation> getReservations;
}
