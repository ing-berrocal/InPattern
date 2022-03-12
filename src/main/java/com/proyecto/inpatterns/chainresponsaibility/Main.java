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
public class Main {
    public static void main(String[] args){
        FoodRequestHandler asian = new AsianHandler();
        FoodRequestHandler chinnese = new ChinneseHandler();
        FoodRequestHandler greek = new GreekFoodHandler();
        FoodRequestHandler indian = new IndianFoodHandler();
        FoodRequestHandler  italian = new ItalianFoodHandler();
        FoodRequestHandler mexican = new MexicanFoodHandler();
        
        asian.setNextRequestHandler(chinnese);
        chinnese.setNextRequestHandler(greek);
        greek.setNextRequestHandler(indian);
        indian.setNextRequestHandler(italian);
        italian.setNextRequestHandler(mexican);
        mexican.setNextRequestHandler(asian);
        
        
        chinnese.processRequestHandler(FoodTypeEnum.ASIAN);
    }
}
