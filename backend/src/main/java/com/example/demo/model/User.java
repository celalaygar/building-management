package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;
 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name  = "users")
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	
	@Column(name  = "uname",nullable = false,length = 200, unique = true)
	@NotEmpty
	@NotNull
	private String username;
	
	@Column(name  = "name")
	private String name;
	
	@Column(name  = "surname")
	private String surname;
	
	@Column(name  = "password")
	@NotEmpty
	@NotNull
	@Size(min = 8,message = "Şifreniz en az 8 karakter olmalıdır.")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message="Şifre en az 1 küçük harf 1 büyük harf ve 1 sayı içermelidir.")
	private String password;
	
	@Column(name  = "real_password")
	private String realPassword;
	
	@Column(name  = "email",unique = true )
	@NotEmpty
	@Size(min = 5,max = 200)
	private String email;

	@Transient
	@NotEmpty
	@NotNull
	@Size(min = 8,message = "Şifreniz en az 8 karakter olmalıdır.")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message="Şifre en az 1 küçük harf 1 büyük harf ve 1 sayı içermelidir.")
	private String repeatPassword;
	
	@Column(name  = "bornDate")
	private Date bornDate;

	@Column(name  = "createdDate")
	private Date createdDate;
	
	@Column(name  = "status")
	private int status;
	
}
