package com.food.paytm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.food.paytm.entities.IndianFoodEntity;

@Repository
public interface IndianFoodRepository extends CrudRepository<IndianFoodEntity,Long>{

}
