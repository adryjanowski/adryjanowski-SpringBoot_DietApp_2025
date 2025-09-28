package com.adryjanowski.SpringBoot_DietApp_2025.controller;

import java.util.List;

import com.adryjanowski.SpringBoot_DietApp_2025.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.adryjanowski.SpringBoot_DietApp_2025.model.Food;

@RestController
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/food")
    public List<Food> getAllFoods(){
        return foodService.getAllFoods();
    }

    @GetMapping("/food/{id}")
    public Food getSingleFood(@PathVariable long id){
        return foodService.getSingleFood(id);
    }

    @PostMapping("/food")
    public Food addFood(@RequestBody Food food) {
        return foodService.addFood(food);
    }

    @PutMapping("/food")
    public Food editFood(@RequestBody Food food) {
        return foodService.editFood(food);
    }

    @DeleteMapping("/food")
    public void deleteFood(@PathVariable long id) {
        foodService.deleteFood(id);
    }
}
