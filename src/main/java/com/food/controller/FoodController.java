package com.food.controller;

import java.util.Iterator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.food.dao.FoodRepo;
import com.food.model.Food;

@Controller
public class FoodController {
	
	@Autowired
	FoodRepo foodRepo;
	
	@RequestMapping("/adminhome")
	public String home() {
		return "adminhome";
	}
	@RequestMapping("/add")
	public String doAdd() {
		return "addfood";
	}
	@RequestMapping("/update")
	public String doUpdate() {
		return "updatefoodSearch";
	}
	@RequestMapping("/delete")
	public String doDelete() {
		return "deletefoodSearch";
	}
	@RequestMapping("/readfoodId")
	public String doRead() {
		return "getfoodId";
	}
	@RequestMapping("/read")
	public String doReadAll() {
		return "displayfood";
	}
	
	
	//item added successfully
	@RequestMapping("/successAdd")
	public ModelAndView createFood(@RequestParam("food_name") String food_name, @RequestParam("food_price") int food_price,@RequestParam("food_category") String food_category, @RequestParam("food_desc")  String food_desc) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("food_name", food_name);
		mv.addObject("food_price", food_price);
		mv.addObject("food_desc", food_desc);
		mv.addObject("food_category", food_category);
		mv.setViewName("addfoodsuccess");
		
		//insert data in database	
		Food food = new Food();
		food.setFood_name(food_name);
		food.setFood_price(food_price);
		food.setFood_desc(food_desc);
		food.setFood_category(food_category);
		
		foodRepo.save(food);
		return mv;	
	}
	
	//update a food item
	@RequestMapping("/searchAndUpdate")
	public ModelAndView searchAndUpdate(@RequestParam("food_id") int food_id) {
		ModelAndView mv = new ModelAndView();
		
		Optional<Food> opt = foodRepo.findById(food_id);
		Food food = opt.get();
		String food_name=food.getFood_name();
		int food_price=food.getFood_price();
		String food_desc = food.getFood_desc();
		String food_category = food.getFood_category();


		mv.addObject("food_id", food_id);
		mv.addObject("food_name", food_name);
		mv.addObject("food_price", food_price);
		mv.addObject("food_desc", food_desc);
		mv.addObject("food_category", food_category);


		mv.setViewName("updatefood");
		return mv;
	}
	
	//updated successfully
	@RequestMapping("/successfoodUpdate")
	public ModelAndView updateFood(@RequestParam("food_id") int food_id, @RequestParam("food_name") String food_name, @RequestParam("food_price") int food_price,@RequestParam("food_category") String food_category, @RequestParam("food_desc")  String food_desc) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("food_id", food_id);
		mv.addObject("food_name", food_name);
		mv.addObject("food_price", food_price);
		mv.addObject("food_desc", food_desc);
		mv.addObject("food_category", food_category);

		mv.setViewName("updatefoodsuccess");
		
		//update data in database
		Optional<Food> opt = foodRepo.findById(food_id);
		Food food = opt.get();
		food.setFood_id(food_id);
		food.setFood_name(food_name);
		food.setFood_price(food_price);
		food.setFood_desc(food_desc);
		food.setFood_category(food_category);

		foodRepo.save(food);
		return mv;
	}
	
	//delete food item
	@RequestMapping("/searchfoodDelete")
	public ModelAndView searchAndDelete(@RequestParam("food_id") int food_id) {
		ModelAndView mv = new ModelAndView();
		
		Optional<Food> opt = foodRepo.findById(food_id);
		Food food = opt.get();
		String food_name=food.getFood_name();
		int food_price=food.getFood_price();
		String food_desc = food.getFood_desc();
		String food_category = food.getFood_category();


		mv.addObject("food_id", food_id);
		mv.addObject("food_name", food_name);
		mv.addObject("food_price", food_price);
		mv.addObject("food_desc", food_desc);
		mv.addObject("food_category", food_category);

		mv.setViewName("deletefood");
		return mv;
	}
	
	//deleted successfully
	@RequestMapping("/successfoodDelete")
	public ModelAndView deleteFood(@RequestParam("food_id") int food_id) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("food_id", food_id);
		mv.setViewName("deletefoodSuccess");
		
		//Delete product data from database
		foodRepo.deleteById(food_id);
		return mv;
	}
	
	
	// get particular food id
	@RequestMapping("/successfoodReadId")
	public ModelAndView getFoodByFood(@RequestParam("food_id") int food_id) {
		
		ModelAndView mv = new ModelAndView();
		Optional<Food> opt= foodRepo.findById(food_id);
		Food food = opt.get();
		
		String food_name=food.getFood_name();
		int food_price=food.getFood_price();
		String food_desc = food.getFood_desc();
		String food_category = food.getFood_category();
		
		mv.addObject("food_id", food_id);
		mv.addObject("food_name", food_name);
		mv.addObject("food_price", food_price);
		mv.addObject("food_desc", food_desc);
		mv.addObject("food_category", food_category);

		mv.setViewName("getFoodsuccess");
		
		return mv;
	}
	

		
}
