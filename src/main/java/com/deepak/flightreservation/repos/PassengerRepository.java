package com.deepak.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
