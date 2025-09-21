package com.adryjanowski.SpringBoot_DietApp_2025.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodDTO {
    private Long id;
    private String name;
    private String producer;
    private int mass; // wartosc masy odniesienia
    private float calories;
    private float protein;
    private float fat;
    private float carbohydrates;
    private int idUser;
}
