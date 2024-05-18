package com.food.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.food.dao.CouponRepo;
import com.food.dao.FoodRepo;
import com.food.model.Coupon;
import com.food.model.Food;

@Controller
public class CouponController {

	
	@Autowired
	CouponRepo couponRepo;
	
	@RequestMapping("/couponhome")
	public String couponHomePage() {
		return "couponhome";
	}
	
	@RequestMapping("/addcoupon")
	public String addCoupon() {
		return "addcoupon";
	}
	
	@RequestMapping("/updatecoupon")
	public String updateCoupon() {
		return "updatecouponSearch";
	}
	
	@RequestMapping("/deletecoupon")
	public String doDelete() {
		return "deletecouponSearch";
	}
	
	@RequestMapping("/getACoupon")
	public String doRead() {
		return "getcouponId";
	}
	
	//coupon added successfully
		@RequestMapping("/couponsuccessAdd")
		public ModelAndView createCoupon(@RequestParam("coupon_name") String coupon_name, @RequestParam("coupon_discount") double coupon_discount) {
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("coupon_name", coupon_name);
			mv.addObject("coupon_discount", coupon_discount);
	
			mv.setViewName("addcouponsuccess");
			
			//insert data in database	
			Coupon coupon = new  Coupon();
			coupon.setCoupon_name(coupon_name);
			coupon.setCoupon_discount(coupon_discount);
			
			couponRepo.save(coupon);
			return mv;	
		}
		
		//update coupon
		@RequestMapping("/searchcouponUpdate")
		public ModelAndView searchcouponUpdate(@RequestParam("coupon_id") int coupon_id) {
			ModelAndView mv = new ModelAndView();
			
			Optional<Coupon> opt = couponRepo.findById(coupon_id);
			Coupon coupon = opt.get();
			String coupon_name=coupon.getCoupon_name();
			double coupon_discount=coupon.getCoupon_discount();

			mv.addObject("coupon_id", coupon_id);
			mv.addObject("coupon_name", coupon_name);
			mv.addObject("coupon_discount", coupon_discount);

			mv.setViewName("updatecoupon");
			return mv;
		}
		
		//updated successfully
		@RequestMapping("/successcouponUpdate")
		public ModelAndView updateCoupon(@RequestParam("coupon_id") int coupon_id, @RequestParam("coupon_name") String coupon_name, @RequestParam("coupon_discount") double coupon_discount) {
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("coupon_id", coupon_id);
			mv.addObject("coupon_name", coupon_name);
			mv.addObject("coupon_discount", coupon_discount);
			mv.setViewName("updatecouponSuccess");
			
			//update data in database
			Optional<Coupon> opt = couponRepo.findById(coupon_id);
			Coupon coupon = opt.get();
			coupon.setCoupon_id(coupon_id);
			coupon.setCoupon_name(coupon_name);
			coupon.setCoupon_discount(coupon_discount);
			
			couponRepo.save(coupon);
			return mv;
		}
		
		//delete coupon item
		@RequestMapping("/searchcouponDelete")
		public ModelAndView searchAndDelete(@RequestParam("coupon_id") int coupon_id) {
			ModelAndView mv = new ModelAndView();
			
			Optional<Coupon> opt = couponRepo.findById(coupon_id);
			Coupon coupon = opt.get();
			String coupon_name =coupon.getCoupon_name();
			double coupon_discount = coupon.getCoupon_discount();

			mv.addObject("coupon_id", coupon_id);
			mv.addObject("coupon_name", coupon_name);
			mv.addObject("coupon_discount", coupon_discount);

			mv.setViewName("deletecoupon");
			return mv;
		}
		
		//deleted successfully
		@RequestMapping("/successcouponDelete")
		public ModelAndView deleteCoupon(@RequestParam("coupon_id") int coupon_id) {
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("coupon_id", coupon_id);
			mv.setViewName("deletecouponsuccess");
			
			//Delete product data from database
			couponRepo.deleteById(coupon_id);
			return mv;
		}

		@RequestMapping("/successCouponReadId")
		public ModelAndView getCouponByID(@RequestParam("coupon_id") int coupon_id) {
			
			ModelAndView mv = new ModelAndView();
			Optional<Coupon> opt= couponRepo.findById(coupon_id);
			Coupon coupon = opt.get();
			
			String coupon_name=coupon.getCoupon_name();
			double coupon_discount=coupon.getCoupon_discount();
			
			mv.addObject("coupon_id", coupon_id);
			mv.addObject("coupon_name", coupon_name);
			mv.addObject("coupon_discount", coupon_discount);
			mv.setViewName("getCouponsuccess");
			
			return mv; 
		}
}
