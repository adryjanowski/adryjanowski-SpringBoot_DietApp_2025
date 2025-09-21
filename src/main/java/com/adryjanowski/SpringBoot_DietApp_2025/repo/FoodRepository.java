package com.adryjanowski.SpringBoot_DietApp_2025.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adryjanowski.SpringBoot_DietApp_2025.model.Food;


public interface FoodRepository extends JpaRepository<Food, Long> {


}
