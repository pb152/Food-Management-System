package com.food.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.food.dao.AdminRepo;
import com.food.model.Admin;
import com.food.model.Coupon;

@Controller
public class AdminController {

		@Autowired
		AdminRepo adminRepo;
		
		
		@RequestMapping("/home")
		public String homepage() {
			return "homepage";
		}
		
		
		@RequestMapping("/adminhomepage")
		public String adminhomepage() {
			return "adminHomePage";
		}
		
		@RequestMapping("/adminLogin")
			public String adminlogin() {
				return "adminLogin";
			}
		
		@RequestMapping("/addAdmin")
		public String addadmin() {
			return "addadmin";
		}
	
		@RequestMapping("/adminsuccessAdd")
		public ModelAndView addadminsucc( @RequestParam("admin_username") String admin_username ,@RequestParam("admin_password") String admin_password ) {
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("admin_username", admin_username);
			mv.addObject("admin_password", admin_password);
			
			mv.setViewName("addAdminsuccess");
			
			Admin admin = new Admin();
			admin.setAdmin_username(admin_username);
			admin.setAdmin_password(admin_password);
			
			adminRepo.save(admin);
			
			return mv;
		}
	
	
		@RequestMapping("/adminsuccesslogin")
		public String loginadminsucc(@RequestParam("admin_id") int admin_id , @RequestParam("admin_username") String admin_username ,@RequestParam("admin_password") String admin_password ) {
			
			Optional<Admin> opt= adminRepo.findById(admin_id);
			Admin admin = opt.get();
			
			if( (admin.getAdmin_id())==(admin_id) && (admin.getAdmin_username()).equals(admin_username) && (admin.getAdmin_password()).equals(admin_password) ) {
				return "adminhome";
				} else {
					return "adminloginfailure";
				}
		
		}
	
		
		@RequestMapping("/deleteAdmin")
		public String doDelete() {
			return "deleteAdminSearch";
		}
	
			//delete admin item
			@RequestMapping("/searchAdminDelete")
			public ModelAndView searchAndDelete(@RequestParam("admin_id") int admin_id) {
				ModelAndView mv = new ModelAndView();
				
				Optional<Admin> opt= adminRepo.findById(admin_id);
				Admin admin = opt.get();
				String admin_username =admin.getAdmin_username();
				String admin_password =admin.getAdmin_password();

				mv.addObject("admin_id", admin_id);
				mv.addObject("admin_username", admin_username);
				mv.addObject("admin_password", admin_password);

				mv.setViewName("deleteAdmin");
				return mv;
			}
			
			
			//deleted successfully
			@RequestMapping("/successAdminDelete")
			public ModelAndView deleteAdmin(@RequestParam("admin_id") int admin_id) {
				
				ModelAndView mv = new ModelAndView();
				mv.addObject("admin_id", admin_id);
				mv.setViewName("deleteAdminsuccess");
				
				//Delete product data from database
				adminRepo.deleteById(admin_id);
				return mv;
			}
	
			
			@RequestMapping("/forgotpasswordadmin")
			public String updateAdmin() {
				return "updateAdminSearch";
			}
			
			
			@RequestMapping("/searchAdminUpdate")
			public ModelAndView forgotpassword(@RequestParam("admin_id") int admin_id) {
				ModelAndView mv = new ModelAndView();
				
				Optional<Admin> opt= adminRepo.findById(admin_id);
				Admin admin = opt.get();
				String admin_username =admin.getAdmin_username();

				mv.addObject("admin_id", admin_id);
				mv.addObject("admin_username", admin_username);

				mv.setViewName("updateAdmin");
				
				return mv;
			}
			
			//updated successfully
			@RequestMapping("/successAdminUpdate")
			public ModelAndView updateAdmin(@RequestParam("admin_id") int admin_id , @RequestParam("admin_username") String admin_username ,@RequestParam("admin_password") String admin_password ) {
				
				ModelAndView mv = new ModelAndView();
				mv.addObject("admin_id", admin_id);
				mv.addObject("admin_username", admin_username);
				mv.addObject("admin_password", admin_password);
				mv.setViewName("updateAdminSuccess");
				
				//update data in database
				Optional<Admin> opt= adminRepo.findById(admin_id);
				Admin admin = opt.get();
				admin.setAdmin_username(admin_username);
				admin.setAdmin_password(admin_password);
				admin.setAdmin_password(admin_password);
				
				adminRepo.save(admin);
				return mv;
			}
}
