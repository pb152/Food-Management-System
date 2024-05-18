package com.food.model;
import jakarta.persistence.*;


@Entity
@Table(name="Coupon")
public class Coupon {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int coupon_id;
	
	@Column(name="Coupon_Name")
	private String coupon_name;
	
	@Column(name="Coupon_Discount")
	private double coupon_discount;

	public int getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}

	public String getCoupon_name() {
		return coupon_name;
	}

	public void setCoupon_name(String coupon_name) {
		this.coupon_name = coupon_name;
	}

	public double getCoupon_discount() {
		return coupon_discount;
	}

	public void setCoupon_discount(double coupon_discount) {
		this.coupon_discount = coupon_discount;
	}

	@Override
	public String toString() {
		return "Coupon [coupon_id=" + coupon_id + ", coupon_name=" + coupon_name + ", coupon_discount="
				+ coupon_discount + "]";
	}

	public Coupon(int coupon_id, String coupon_name, double coupon_discount) {
		super();
		this.coupon_id = coupon_id;
		this.coupon_name = coupon_name;
		this.coupon_discount = coupon_discount;
	}

	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
