/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.behavorial.chainresponsability.util;

/**
 *
 * @author DELL
 */
public interface FoodRequestHandler {

    public void setNextRequestHandler(FoodRequestHandler requestHandler);

    public void processRequestHandler(FoodTypeEnum food);

}
