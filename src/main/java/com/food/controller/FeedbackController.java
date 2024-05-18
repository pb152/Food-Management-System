package com.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.food.dao.FeedbackRepo;
import com.food.dao.FoodRepo;
import com.food.model.Feedback;
import com.food.model.Food;

@Controller
public class FeedbackController {

	@Autowired
	FeedbackRepo feedbackRepo;
	
	
	@RequestMapping("/addFeedback")
	public String addFedback() {
		return "addFeedback";
	}
	
	@RequestMapping("/successAddfeedback")
public ModelAndView createFeedback(@RequestParam("cust_name") String cust_name, @RequestParam("hospitality") String hospitality,@RequestParam("quality") String quality, @RequestParam("suggestion")  String suggestion) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cust_name", cust_name);
		mv.addObject("hospitality", hospitality);
		mv.addObject("quality", quality);
		mv.addObject("suggestion", suggestion);
		mv.setViewName("addfeedbacksuccess");
		
		//insert data in database	
		Feedback feedback= new Feedback();
		feedback.setCust_name(cust_name);
		feedback.setHospitality(hospitality);
		feedback.setQuality(quality);
		feedback.setSuggestion(suggestion);
		
		feedbackRepo.save(feedback);
		return mv;	
	}
	
	@RequestMapping("/thankyou")
	public String gotoThankyou() {
	return "thankYou";
	}
	}
