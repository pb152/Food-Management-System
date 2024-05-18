package com.food.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.food.dao.CouponRepo;
import com.food.dao.CustomerRepo;
import com.food.dao.FoodRepo;
import com.food.model.Coupon;
import com.food.model.Customer;
import com.food.model.Food;



@Controller
public class CustomerController {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private FoodRepo foodRepo;

	@Autowired
	private CouponRepo couponRepo;

//	@RequestMapping("/")
//	public String routeHome() {
//		return "home";
//	}
//	@RequestMapping("/home")
//	public String homepage() {
//		return "homepage";
//	}
	
	@RequestMapping("/customerhomepage")
	public String customerhomepage() {
		return "customerHomePage";
	}
	
	@RequestMapping("/customerlogin")
	public String customerlogin() {
		return "customerLogin";
	}

	@RequestMapping("/addcustomer")
	public String addcustomer() {
		return "addCustomer";
	}
	@RequestMapping("/forgotpassword")
	public String dopassword() {
		return "updateCustomerSearch";
	}
//	@RequestMapping("/customerhome")
//	public String domenu() {
//		return "customerHome";
//	}
//	
//	@RequestMapping("/addcart")
//	public String docart() {
//		return "discountcart";
//	}
	
	@RequestMapping("/takeaway")
	public String dotakeaway()
	{
		return "takeAway";
	}
	@RequestMapping("/homedelivery")
	public String dohomedelivery()
	{
		return "homeDelivery";
	}
	//takaway and home delivery page banvaychet
	
	@RequestMapping("/customerAdd")
	public ModelAndView createCustomer(@RequestParam("cust_name") String cust_name, @RequestParam("address") String address, @RequestParam("phone")  String phone) {

		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cust_name", cust_name);
		mv.addObject("address", address);
		mv.addObject("phone", phone);
		mv.setViewName("addCustomersuccess");

		//insert data in database	
		Customer cust = new Customer();
		cust.setCust_name(cust_name);
		cust.setAddress(address);
		cust.setPhone(phone);
		customerRepo.save(cust);
		return mv;	
	}
	
	@RequestMapping("/customersuccesslogin")
	public ModelAndView logincustsucc(@RequestParam("cust_id") int cust_id ,@RequestParam("phone") String phone ) {
		
		Optional<Customer> opt= customerRepo.findById(cust_id);
		Customer cust = opt.get();
		
		if((cust.getCust_id())==(cust_id) && (cust.getPhone()).equals(phone)) {
			ModelAndView mv = new ModelAndView();
			Iterable<Food>foodlist = foodRepo.findAll();
			mv.addObject("foodlist",foodlist);
			mv.setViewName("customerHome");
			return mv;	
			} else {
				ModelAndView mvn = new ModelAndView();
				mvn.setViewName("customerLoginFailure");
				return mvn;
			}
	
	}

	@RequestMapping("/searchcustomerupdate")
	public ModelAndView forgotpassword(@RequestParam("cust_id") int cust_id) {
		ModelAndView mv = new ModelAndView();
		
		Optional<Customer> opt= customerRepo.findById(cust_id);
		Customer cust = opt.get();
		String cust_name = cust.getCust_name();

		mv.addObject("cust_id",cust_id);
		mv.addObject("cust_name", cust_name);

		mv.setViewName("updateCustomer");
		
		return mv;
	}
	
	@RequestMapping("/successcustomerupdate")
	public ModelAndView updateCustomer(@RequestParam("cust_id") int cust_id , @RequestParam("cust_name") String cust_name ,@RequestParam("address") String address ,@RequestParam("phone") String phone) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cust_id",cust_id);
		mv.addObject("cust_name", cust_name);
		mv.addObject("address", address);
		mv.addObject("phone", phone);
		mv.setViewName("updateCustomerSuccess");
		
		//update data in database
		Optional<Customer> opt= customerRepo.findById(cust_id);
		Customer cust = opt.get();
		cust.setCust_id(cust_id);
		cust.setCust_name(cust_name);
		cust.setAddress(address);
		cust.setPhone(phone);
		customerRepo.save(cust);
		return mv;
	}

	@RequestMapping("/customerhome")
	public ModelAndView getAllFood() {		
		ModelAndView mv = new ModelAndView();
		Iterable<Food>foodlist = foodRepo.findAll();
		mv.addObject("foodlist",foodlist);
		mv.setViewName("customerHome");
		return mv;	
	}

	@RequestMapping("/addtocart/{food_id}")
	public String getCart(@PathVariable("food_id") int food_id, Model m) {
		//Food food = foodRepo.findById(food_id);
		Optional<Food> opt = foodRepo.findById(food_id);
		Food food= opt.get();
		m.addAttribute("food", food);
		return "cart";	
	}

	
	@RequestMapping("/bill")
	public ModelAndView generateBill(@RequestParam("food_price") Integer food_price,@RequestParam("quantity") Integer quantity ) {

		ModelAndView mv = new ModelAndView();
		
        Integer total_bill = quantity*food_price ;
		
        mv.addObject("total_bill",total_bill);
		mv.setViewName("billGenerator");
		return mv;
	}

	@RequestMapping("/couponDiscount")
	public ModelAndView getCouponDiscount(@RequestParam("coupon_name") String coupon_name , @RequestParam("total_bill") Integer total_bill) {
		
		ModelAndView mv = new ModelAndView();
		Optional<Coupon> opt= couponRepo.findByCouponName(coupon_name);
		Coupon cpn=opt.get();
		double discount;
		double discount_money;
		double  final_total_bill;
		
		        	 discount=cpn.getCoupon_discount();
		     		
		    		 discount_money = discount * total_bill ;
		    		 final_total_bill= total_bill - discount_money;
		    		
		    		mv.addObject("final_total_bill",final_total_bill);
		    		mv.addObject("discount_money",discount_money);
		    		mv.addObject("total_bill",total_bill);
		    		
		    		
		    		mv.setViewName("discountportal");
		
		
		return mv;
	}
	
	 
	@RequestMapping("/takeawayy")
		public String doTakeAwayhere() {
			return "takeAway";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	

			//@PathVariable("food_id") int food_id) {

//		ModelAndView mv = new ModelAndView();
		//Food f = this.foodRepo.findById(food_id);
//		List<Coupon> cou = (couponRepo.getCouponByName());
//		couponRepo.findB
//		//Coupon cpn;
//		cou.forEach(c -> {
//			System.out.println(c.getCoupon_name()+" "+c.getCoupon_discount());
//		});
//		return "delivery";
		//		Coupon coupon = couponRepo.findByName(coupon_name);
		//String cou_name=cou.get
		//		if(cou.equals(coupon_name))
		//		{
		//			System.out.println("Total Bill"+(f.getFood_price()*coupon));
		//			return 
		//		}
		//		mv.addObject("coupon_name", coupon_name);
		//		mv.addObject("coupon_discount", coupon_discount);
//	}
	

//	@RequestMapping("/discountAdd1")
//	public ModelAndView getDiscount(@RequestParam("coupon_id") int coupon_id,@RequestParam("food_id") int food_id) {
//		ModelAndView mv = new ModelAndView();
//		Optional<Coupon> opt =couponRepo.findById(coupon_id);
//		Coupon cou = opt.get();
//		
//		Food opt1 = foodRepo.findById(food_id);
//		String foodpr =  opt1.getFood_price();
//		
//		double coupon_discount=cou.getCoupon_discount();
//		// f = this.foodRepo.findById(food_id);
//		int food_prc = Integer.parseInt(foodpr);
//		double final_bill=(food_prc * coupon_discount);
//		mv.addObject("final_bill",final_bill);
//		mv.setViewName("delivery");
//		
//		return mv;
//		
//	}
}

