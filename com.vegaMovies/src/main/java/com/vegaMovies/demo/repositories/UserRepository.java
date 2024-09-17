package com.vegaMovies.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vegaMovies.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);


}
