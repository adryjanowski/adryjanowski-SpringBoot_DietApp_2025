package com.adryjanowski.SpringBoot_DietApp_2025.repository;

import com.adryjanowski.SpringBoot_DietApp_2025.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}
