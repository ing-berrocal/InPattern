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
public class GreekFoodHandler implements FoodRequestHandler {

    private FoodRequestHandler foodNextRequestHandler;

    @Override
    public void setNextRequestHandler(FoodRequestHandler requestHandler) {
        this.foodNextRequestHandler = requestHandler;
    }

    @Override
    public void processRequestHandler(FoodTypeEnum food) {
        if (FoodTypeEnum.GREEK == food) {
            System.out.println("Griega!!");
        } else {
            this.foodNextRequestHandler.processRequestHandler(food);
        }
    }

}
