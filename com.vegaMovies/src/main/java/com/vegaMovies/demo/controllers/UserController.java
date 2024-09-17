package com.vegaMovies.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vegaMovies.demo.entities.Movie;
import com.vegaMovies.demo.entities.User;
import com.vegaMovies.demo.services.MovieService;
import com.vegaMovies.demo.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	UserService userv;
	
	@Autowired
	MovieService movserv;
	
	@PostMapping("register")
	public String addUsers(@ModelAttribute User user) {
		boolean status = userv.emailExits(user.getEmail());
		if(status==true) {
			return "registerfail";
		}else {
			userv.adddUsers(user);
			return "registersuccess";
		}
		
	}
	

	@PostMapping("login")
	public String validateUser(@RequestParam String email,@RequestParam String password, HttpSession session) {
		boolean loginStatus = userv.checkUser(email, password);
		if(loginStatus ==true) {
			session.setAttribute("email", email);
			
			if(email.equals("admin@gmail.com")) {
				return "adminhome";
			}
			else {
				return "home";
			}
		}
		else {
			return "login";
		}
	}
	
	@GetMapping("viewuser")
	public String viewUser(Model model) {
		List<User> userList =userv.viewUser();
		model.addAttribute("user", userList);
		return "viewuser";
	}
	
	@GetMapping("exploremovies")
	public String exploreMovie( Model model,HttpSession session) {
		String email = (String)session.getAttribute("email");
		User user  = userv.getUser(email);
		
		if(user.isPremium()==true){
			List<Movie> movieList = movserv.viewMovie();
			model.addAttribute("movie", movieList);
			return "viewmovieuser";
		}
		else {
			return "payment";
		}
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return  "login";
	}
	
	@PostMapping("deleteuser")
	public String deleteUser(@RequestParam String email) {
		userv.deleteUser(email);
		return "adminhome";
	}
	@PostMapping("upd-user")
	public String updateUser(@ModelAttribute User user) {
		userv.updateUser(user);
		return "updatesuccess";
	}

}
