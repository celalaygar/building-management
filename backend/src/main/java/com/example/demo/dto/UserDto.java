package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.example.demo.model.User;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private Long id;
	
	private String username;
	
	private String name;
	
	private String surname;

	private String email;

	private String repeatPassword;
	
	private Date bornDate;
	 
	private String image;
	
	public String getFullName() {
		return this.name+" "+this.surname;
	}
	public UserDto(User user) {
		this.id=user.getId();
		this.username=user.getUsername();
		this.name=user.getName();
		this.surname=user.getSurname();
		this.email=user.getEmail();
		this.bornDate=user.getBornDate();
		this.image=user.getImage();
	}
}
