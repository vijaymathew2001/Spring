package com.spring.tx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_TABLE")
public class User {

	@Id
	@SequenceGenerator(name="user_id_seq",sequenceName="USER_SEQ",allocationSize=0)
	@GeneratedValue(strategy = GenerationType.AUTO,generator="user_id_seq")
	@Column(name="ID", nullable = false)
	private int id;
	
	@Column(name="USERNAME", nullable = false)
	private String username;
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

}
