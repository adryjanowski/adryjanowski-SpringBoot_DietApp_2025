package com.adryjanowski.SpringBoot_DietApp_2025.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.adryjanowski.SpringBoot_DietApp_2025.exception.FoodNotFoundException;
import com.adryjanowski.SpringBoot_DietApp_2025.model.Food;
import com.adryjanowski.SpringBoot_DietApp_2025.repo.FoodRepository;
import com.adryjanowski.SpringBoot_DietApp_2025.service.IFoodService;

@Service
public class FoodServiceImpl implements IFoodService {

    @Autowired
    private FoodRepository repo;

    @Override
    public Food saveFood(Food food) {
        return repo.save(food);
    }

    @Override
    public List<Food> getAllFoods() {
        return repo.findAll();
    }

    @Override
    public Food getFoodById(Long id) {
        Optional<Food> opt = repo.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new FoodNotFoundException("Food not found for id: " + id);
        }
    }

    @Override
    public void deleteFoodById(Long id) {
        repo.delete(getFoodById(id));
    }

    @Override
    public void updateFood(Food food) {
        repo.save(food);
    }

}