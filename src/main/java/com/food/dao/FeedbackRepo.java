package com.food.dao;


import org.springframework.data.repository.CrudRepository;
import com.food.model.Feedback;


public interface FeedbackRepo extends CrudRepository<Feedback, Integer> {

//	void save(Feedback feed);
	
}
