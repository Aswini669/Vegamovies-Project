package com.vegaMovies.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vegaMovies.demo.entities.User;
import com.vegaMovies.demo.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	UserRepository urepo;
	@Override
	public String adddUsers(User user) {
		urepo.save(user);
		return "user is created";
	}
	@Override
	public boolean emailExits(String email) {
		
		if(urepo.findByEmail(email)==null) {
			return false;
		}else {
			return true;
		}
	}
	@Override
	public boolean checkUser(String email, String password) {
		User user = urepo.findByEmail(email);
		if(user==null) {
			return false;
		}
		String db_password = user.getPassword();
		if(db_password.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public List<User> viewUser() {
		List<User> userList = urepo.findAll();
		return userList;
	}
	@Override
	public User getUser(String email) {
		User user = urepo.findByEmail(email);
		return user;
	}

	@Override
	public void updateUser(User user) {
		User usr=urepo.findByEmail(user.getEmail());
		urepo.deleteById(usr.getId());
		urepo.save(user);
		
	}
	@Override
	public String deleteUser(String email) {
		User user=urepo.findByEmail(email);
		urepo.deleteById(user.getId());
		return "user has delete";
	}
	
	

}
