package com.deepak.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
