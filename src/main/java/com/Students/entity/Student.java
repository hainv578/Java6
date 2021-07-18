package com.Students.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Students")
public class Student {
	@Id
	String email;
	String fillname;
	Double marks;
	Boolean gender;
	String country;
	
}
