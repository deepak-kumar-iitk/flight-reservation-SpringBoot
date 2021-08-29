package com.deepak.flightreservation.services;

import com.deepak.flightreservation.dto.ReservationRequest;
import com.deepak.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
