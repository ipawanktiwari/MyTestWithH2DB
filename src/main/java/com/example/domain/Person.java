package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	private String fullname;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", fullname=" + fullname + "]";
	}
	

}
