package com.vegaMovies.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 int id;
	 String moviename;
	 @Column(length = 2000)
	 String movielink;
	 String moviegenre;
	 String moviecast;
	 String moviedirector;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int id, String moviename, String movielink, String moviegenre, String moviecast,
			String moviedirector) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.movielink = movielink;
		this.moviegenre = moviegenre;
		this.moviecast = moviecast;
		this.moviedirector = moviedirector;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getMovielink() {
		return movielink;
	}
	public void setMovielink(String movielink) {
		this.movielink = movielink;
	}
	public String getMoviegenre() {
		return moviegenre;
	}
	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;
	}
	public String getMoviecast() {
		return moviecast;
	}
	public void setMoviecast(String moviecast) {
		this.moviecast = moviecast;
	}
	public String getMoviedirector() {
		return moviedirector;
	}
	public void setMoviedirector(String moviedirector) {
		this.moviedirector = moviedirector;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", moviename=" + moviename + ", movielink=" + movielink + ", moviegenre="
				+ moviegenre + ", moviecast=" + moviecast + ", moviedirector=" + moviedirector + "]";
	}
	 

	

}
