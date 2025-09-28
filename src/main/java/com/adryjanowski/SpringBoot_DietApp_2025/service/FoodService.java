package com.adryjanowski.SpringBoot_DietApp_2025.service;

import com.adryjanowski.SpringBoot_DietApp_2025.model.Food;
import com.adryjanowski.SpringBoot_DietApp_2025.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
