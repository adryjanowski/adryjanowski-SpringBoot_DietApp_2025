package com.adryjanowski.SpringBoot_DietApp_2025.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String producer;
    private int mass; // wartosc masy odniesienia
    private float calories;
    private float proteins;
    private float fat;
    private float carbohydrates;
    private int idUser;
}
