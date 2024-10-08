package com.vegaMovies.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vegaMovies.demo.entities.Movie;
import com.vegaMovies.demo.services.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	MovieService movserv;
	
	@PostMapping("addmovie")
	public String addMovie(@ModelAttribute Movie mov) {
		movserv.addMovie(mov);
		return "addMoviesuccess";
	}
	
	@GetMapping("viewmovie")
	public String viewMovie(Model model) {
		List<Movie> movieList = movserv.viewMovie();
		model.addAttribute("movie", movieList);
		return "viewmovie";
	}
	
	@GetMapping("viewmovieuser")
	public String viewmovieuser(Model model) {
		List<Movie> movieList = movserv.viewMovie();
		model.addAttribute("movie", movieList);
		return "viewmovieuser";
	}
	@PostMapping("deletemovie")
	public String deleteMovie(@RequestParam String moviename) {
		
		movserv.deleteMovie(moviename);
		
		return null;
		
		
		
	}

}
