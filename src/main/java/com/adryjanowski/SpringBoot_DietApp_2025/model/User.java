package com.adryjanowski.SpringBoot_DietApp_2025.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String sex;
    private double height;
    private int weight;
    private double activityCoefficient;
    private int caloriesReductionValue;

    @OneToMany
    @JoinColumn(name = "food_id")
    private List<Food> myFoodList;
}
