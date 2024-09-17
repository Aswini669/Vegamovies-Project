package com.vegaMovies.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vegaMovies.demo.entities.Movie;
import com.vegaMovies.demo.repositories.MovieRepository;

@Service
public class MovieServiceImplementation implements MovieService{
	
	@Autowired
	MovieRepository movrepo;

	@Override
	public String addMovie(Movie mov) {
		movrepo.save(mov);
		return "movie is added";
	}

	@Override
	public List<Movie> viewMovie() {
		List<Movie> movieList = movrepo.findAll();
		return movieList;
	}

	@Override
	public String deleteMovie(String moviename) {
		// TODO Auto-generated method stub
		Movie movie=movrepo.findByMoviename(moviename);
		movrepo.deleteById(movie.getId());
		return "movie is delete";
	}

	
	public List<Movie> updateMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

	

