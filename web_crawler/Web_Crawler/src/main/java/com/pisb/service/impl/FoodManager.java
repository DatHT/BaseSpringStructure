package com.pisb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pisb.dao.IBaseDao;
import com.pisb.model.Food;
import com.pisb.service.IFoodManager;

@Service
public class FoodManager implements IFoodManager {

	@Autowired
	private IBaseDao<Food, Long> foodDao;
	
	@Override
	public void insert(Food food) {
		foodDao.insert(food);
		
	}

}
