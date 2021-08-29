package com.deepak.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.flightreservation.dto.ReservationRequest;
import com.deepak.flightreservation.entities.Flight;
import com.deepak.flightreservation.entities.Passenger;
import com.deepak.flightreservation.entities.Reservation;
import com.deepak.flightreservation.repos.FlightRepository;
import com.deepak.flightreservation.repos.PassengerRepository;
import com.deepak.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		// make payment
		
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengeEmail());
		passenger.setPhone(request.getPassengerPhone());
		Passenger savePassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savePassenger);
		reservation.setCheckedIn(false);
		Reservation saveReservation = reservationRepository.save(reservation);
		return saveReservation;
	}

}
