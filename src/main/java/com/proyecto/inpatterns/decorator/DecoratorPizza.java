/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.decorator;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class DecoratorPizza implements Pizza
{

    final Pizza pizza;
    ArrayList toppings;
    public DecoratorPizza(Pizza pizza) {
        this.pizza = pizza;
        toppings = this.pizza.getToppings();
        toppings.add("Extra chesse");
    }        
    
    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
    
}
