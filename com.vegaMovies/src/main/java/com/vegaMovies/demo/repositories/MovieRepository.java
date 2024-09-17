package com.vegaMovies.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vegaMovies.demo.entities.Movie;
import com.vegaMovies.demo.entities.User;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	public Movie findByMoviename(String moviename);

}
