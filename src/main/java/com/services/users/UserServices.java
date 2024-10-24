package com.services.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.users.Users;
import com.repo.users.IuserRepo;

@Service
public class UserServices {

	@Autowired
	public  IuserRepo userRepo; 

	// save user
	public Users saveUser(Users user) {
		return userRepo.save(user);
	}

	// save users
	public List<Users> saveUsers(List<Users> users) {
		return userRepo.saveAll(users);
	}

	// fetch all users
	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}

//	// fetch all users
//	public Optional<Users> getUser(int id) {
//
//		return userRepo.findById(id);
//	}

	// fetch all user by Id
	public Users getUser(int id) {

		return userRepo.findById(id).orElse(null);
	}

	// fetch all user by name
	public Users getUserByName(String userName) {

		return userRepo.findByUserName(userName);
	}
	
	// fetch all user by name
		public boolean validateUser(String userName,String passWord) {
			
			
			Users user = userRepo.validateUser(userName,passWord);
			
			 if(null!=user)
				 return true;
			 
			 return false;
		}

	// Delete User

	public String deleteUser(int id) {
		userRepo.deleteById(id);

		return "User Deleted";
	}

	// Update User
	public Users updateUser(Users user) {
		Users existingUser = userRepo.findById(user.getId()).orElse(null);

		existingUser.setPassWord(user.getPassWord());
		existingUser.setRole(user.getRole());
		return userRepo.save(existingUser);
	}

}
