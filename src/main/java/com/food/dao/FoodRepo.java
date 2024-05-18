package com.food.dao;

import org.springframework.data.repository.CrudRepository;

import com.food.model.Food;

public interface FoodRepo extends CrudRepository<Food, Integer> {

}
