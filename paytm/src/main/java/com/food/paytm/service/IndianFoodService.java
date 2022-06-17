package com.food.paytm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.paytm.entities.IndianFoodEntity;
import com.food.paytm.repository.IndianFoodRepository;

@Service
public class IndianFoodService {

	@Autowired
	IndianFoodRepository indianFoodRepo;
	
	public void createFoodItem(IndianFoodEntity indianFoodItem) {
		indianFoodRepo.save(indianFoodItem);
		
	}

	public List<IndianFoodEntity> getFoodItems() {
		return (List<IndianFoodEntity>) indianFoodRepo.findAll();
	}

	public void updateFoodItem(IndianFoodEntity indianFoodItem) {
		indianFoodRepo.save(indianFoodItem);
	}

	public void updateRating(Long id, Integer rating) {
	  IndianFoodEntity entity =	indianFoodRepo.findById(id).get();
	  entity.setRating(rating);
	  indianFoodRepo.save(entity);
	}

}
