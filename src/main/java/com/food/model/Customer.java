package com.food.model;
import jakarta.persistence.*;


@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cust_id;
	private String cust_name;
	private String address;
	private String phone;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Customer(int cust_id, String cust_name, String address, String phone) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.address = address;
		this.phone = phone;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "cust_id=" + cust_id + ", cust_name=" + cust_name + ", address=" + address + ", phone="
				+ phone +"";
	}


}
