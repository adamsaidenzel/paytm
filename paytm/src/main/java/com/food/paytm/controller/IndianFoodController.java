package com.food.paytm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.paytm.entities.IndianFoodEntity;
import com.food.paytm.service.IndianFoodService;


@RestController
@RequestMapping("/indian-food")
public class IndianFoodController {
	
	@Autowired
	IndianFoodService indianFoodSvc;
	
	@GetMapping("/welcome-message")
	public String getWelcomeMessage() {
		String message = "Welcome to Indian food";
		return message;
	}

	@PostMapping("/create-food-item")
	public void createFoodItem(@RequestBody IndianFoodEntity indianFoodItem) {
		indianFoodSvc.createFoodItem(indianFoodItem);
	}
	
	@GetMapping("/fetch-food-items")
	public List<IndianFoodEntity> getFoodItems() {
		return indianFoodSvc.getFoodItems();
	}
	
	
	@PutMapping("/update-food-item")
	public void updateFoodItem(@RequestBody IndianFoodEntity indianFoodItem) {
		indianFoodSvc.updateFoodItem(indianFoodItem);
	}
	
	@PatchMapping("/update-rating/{id}/{rating}")
	public void updateRating(@PathVariable Long id,@PathVariable Integer rating) {
		indianFoodSvc.updateRating(id,rating);
	}
	
	
	
	
}