package com.adryjanowski.SpringBoot_DietApp_2025.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
public class Food {

    @Id
    private Long id;
    private String productName;
    private String producer;
    private float productWeight;
    private float proteins;
    private float fat;
    private float carbohydrates;
    private Long idUser;
}
