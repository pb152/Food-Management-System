package com.food.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.food.model.Admin;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer> {

}
