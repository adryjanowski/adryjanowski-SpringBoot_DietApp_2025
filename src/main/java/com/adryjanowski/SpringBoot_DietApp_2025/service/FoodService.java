package com.adryjanowski.SpringBoot_DietApp_2025.service;

import com.adryjanowski.SpringBoot_DietApp_2025.model.Food;
import com.adryjanowski.SpringBoot_DietApp_2025.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food getSingleFood(long id){
        return foodRepository.findById(id)
                .orElseThrow();
    }

    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    @Transactional
    public Food editFood(Food food) {
        Food foodEdited = foodRepository.findById(food.getId())
                .orElseThrow();
        foodEdited.setProductName(food.getProductName());
        foodEdited.setProducer(food.getProducer());
        foodEdited.setProductWeight(food.getProductWeight());
        foodEdited.setProteins(food.getProteins());
        foodEdited.setFat(food.getFat());
        foodEdited.setCarbohydrates(food.getCarbohydrates());
        return foodEdited;
    }

    public void deleteFood(long id) {
       foodRepository.deleteById(id);
    }

}
