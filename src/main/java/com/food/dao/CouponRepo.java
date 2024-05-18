package com.food.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.food.model.Coupon;



public interface CouponRepo extends JpaRepository<Coupon, Integer>{

	@Query("select u from Coupon u where u.coupon_name =  ?1")
	public Optional<Coupon> findByCouponName(String coupon_name);
	
}
