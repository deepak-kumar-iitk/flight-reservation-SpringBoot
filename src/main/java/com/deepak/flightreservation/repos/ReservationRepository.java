package com.deepak.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
