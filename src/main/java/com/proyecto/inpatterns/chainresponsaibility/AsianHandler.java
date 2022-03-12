/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.chainresponsaibility;

/**
 *
 * @author DELL
 */
public class AsianHandler implements FoodRequestHandler{

    private FoodRequestHandler foodNextRequestHandler;
    
    @Override
    public void setNextRequestHandler(FoodRequestHandler requestHandler) {
        this.foodNextRequestHandler = requestHandler;
    }

    @Override
    public void processRequestHandler(FoodTypeEnum food) {
        if(FoodTypeEnum.ASIAN == food){
            System.out.println("Asiatica!!");
        }else{
            this.foodNextRequestHandler.processRequestHandler(food);
        }
    }
    
}
