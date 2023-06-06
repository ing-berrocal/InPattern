/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.behavorial.chainresponsability;

import com.proyecto.inpatterns.behavorial.chainresponsability.util.FoodRequestHandler;
import com.proyecto.inpatterns.behavorial.chainresponsability.util.FoodTypeEnum;

/**
 *
 * @author DELL
 */
public class AsianHandler implements FoodRequestHandler {

    private FoodRequestHandler foodNextRequestHandler;

    @Override
    public void setNextRequestHandler(FoodRequestHandler requestHandler) {
        this.foodNextRequestHandler = requestHandler;
    }

    @Override
    public void processRequestHandler(FoodTypeEnum food) {
        if (FoodTypeEnum.ASIAN == food) {
            System.out.println("Asiatica!!");
        } else {
            if (foodNextRequestHandler == null)
                throw new RuntimeException("No existe un siguiente elemento");
            this.foodNextRequestHandler.processRequestHandler(food);
        }
    }

}
