package com.adryjanowski.SpringBoot_DietApp_2025.exception;


public class FoodNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public  FoodNotFoundException() {
        super();
    }

    public  FoodNotFoundException(String customMessage){
        super(customMessage);
    }
}
