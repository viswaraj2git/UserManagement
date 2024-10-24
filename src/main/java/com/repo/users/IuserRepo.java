package com.repo.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.users.Users;

@Repository
public interface IuserRepo extends JpaRepository<Users, Integer>{

	Users findByUserName(String userName);
	
	@Query("select u from Users u where u.userName = ?1 and passWord=?2")
	Users validateUser(String userName,String passWord);
	
}
