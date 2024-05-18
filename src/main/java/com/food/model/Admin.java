package com.food.model;


import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="Admin")
public class Admin {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int admin_id;
	
	@Column(name="Admin_username")
	private String admin_username;
	
	@Column(name="Admin_password")
	private String admin_password;

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_username() {
		return admin_username;
	}

	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_username=" + admin_username + ", admin_password="
				+ admin_password + "]";
	}

	public Admin(int admin_id, String admin_username, String admin_password) {
		super();
		this.admin_id = admin_id;
		this.admin_username = admin_username;
		this.admin_password = admin_password;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
