package com.vegaMovies.demo.services;

import java.util.List;

import com.vegaMovies.demo.entities.User;

public interface UserService {
	
	public String adddUsers(User user);
	public boolean emailExits(String email);
	public boolean checkUser(String email, String password);
	public List<User> viewUser();
	public User getUser(String email);
	public void updateUser(User user);
	public String  deleteUser(String email);

}
