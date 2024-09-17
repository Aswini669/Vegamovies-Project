package com.vegaMovies.demo.services;

import java.util.List;

import com.vegaMovies.demo.entities.Movie;

public interface MovieService {
	
	public String addMovie(Movie mov);
	public List<Movie> viewMovie();
	public String deleteMovie(String moviename);
	public List<Movie> updateMovie();
	
	

}
