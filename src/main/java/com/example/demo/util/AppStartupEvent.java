package com.example.demo.util;
import com.example.demo.entity.Guest;
import com.example.demo.entity.Reservation;
import com.example.demo.entity.Room;
import com.example.demo.repository.GuestRepository;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.repository.RoomRepository;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;


    public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        //Pobieranie elementów z bazy danych i prezentacja na ekranie
        Iterable<Room> rooms = this.roomRepository.findAll();
        System.out.println("Rooms: ");
        rooms.forEach(System.out::println);

        // Pobieranie elementów z bazy dla Guest
        System.out.println("Guests: ");
        for (Guest guest : this.guestRepository.findAll()) {
            System.out.println(guest);
        }

        System.out.println("Reservations: ");
        // Pobieranie elementów z bazy dla Reservation
        for (Reservation reservation : this.reservationRepository.findAll()) {
            System.out.print(reservation);
        }

//        Date date = this.dateUtil.createDateFromString("2022-01-01");

    }
}