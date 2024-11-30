package com.um.users.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String passWord;
	
	@Column(name="confirmPassword")
	private String confirmPassword;
	
	@Column(name="email")
	private String email;
	
	@Column(name="role")
	private String role;
	
	@LastModifiedDate
	@Column(name="LastUpdatedDate")
	private LocalDateTime lastUpdatedDate;
	
	@CreatedDate
	@Column(name="CreatedDate")
	private LocalDateTime createdDate;

}
