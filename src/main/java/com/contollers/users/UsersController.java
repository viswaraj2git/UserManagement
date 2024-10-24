package com.contollers.users;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.users.Users;
import com.services.users.UserServices;


@RestController
@CrossOrigin
public class UsersController {

	@Autowired
	UserServices userSvc;
	
	//testing uma
	@GetMapping("/test")
    public String testServer() {
        return "Server OK ";
    }
	
	@GetMapping("/error")
    public String testError() {
        return "error";
    }

	@CrossOrigin(origins = "*")
	@PostMapping("/addUser")
	public Users addUser(@RequestBody Users user) {
		System.out.println("Inside addUser");
		return userSvc.saveUser(user);
	}

	@PostMapping("/addUsers")
	public List<Users> addUsers(@RequestBody List<Users> userList) {
		return userSvc.saveUsers(userList);
	}

	@GetMapping("/getUser/{id}")
	public Users getUser(@PathVariable int id) {
		return userSvc.getUser(id);
	}

	@GetMapping("/validateUser/{userName}/{passWord}")
	public boolean validateUser(@PathVariable String userName,@PathVariable String passWord) {
		return userSvc.validateUser(userName,passWord);
	}

	@GetMapping("/getUsers")
	public List<Users> getAllUsers() {
		return userSvc.getAllUsers();
	}

	@PutMapping("/updateUser")
	public Users updateUser(@RequestBody Users user) {
		return userSvc.updateUser(user);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userSvc.deleteUser(id);
	}

}
