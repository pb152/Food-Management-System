package com.food.dao;


import org.springframework.data.repository.CrudRepository;
import com.food.model.Customer;


public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
}
