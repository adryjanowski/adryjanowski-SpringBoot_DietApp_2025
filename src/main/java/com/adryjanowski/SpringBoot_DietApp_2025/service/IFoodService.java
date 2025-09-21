package com.adryjanowski.SpringBoot_DietApp_2025.service;

import java.util.List;
import com.adryjanowski.SpringBoot_DietApp_2025.model.Food;

public interface IFoodService {

    public Food saveFood(Food food);

    public List<Food> getAllFoods();

    public Food getFoodById(Long id);

    public void deleteFoodById(Long id);

    public void updateFood(Food food);

}
