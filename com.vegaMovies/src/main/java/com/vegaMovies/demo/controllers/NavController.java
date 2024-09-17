package com.vegaMovies.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("map-register")
	public String mapRegister() {
		return "register";
	}
	
	@GetMapping("map-login")
	public String mapLogin() {
		return "login";
	}
	
	@GetMapping("map-addmovie")
	public String mapAddMovie() {
		return "addmovie";
	}
	@GetMapping("map-deletemovie")
	public String fordelete() {
		return "deletemovie";
	}
	@GetMapping("map-deleteuser")
	public String fordeleteuser() {
		return "deleteuser";
	}
	@GetMapping("updateuser")
	public String forupdateuser() {
		return "updateuser";
	}
	@GetMapping("/home")
	public String home()
	{
		return "adminhome";
	}

	@GetMapping("/showuser")
	public String showUsers()
	{
		return "viewuser";
	}
	
}
