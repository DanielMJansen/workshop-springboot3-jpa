package com.danieljansen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieljansen.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
