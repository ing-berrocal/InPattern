/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.adapter;

/**
 *
 * @author DELL
 */
public class Adapter implements City{

    City ciudad;

    public Adapter(City ciudad) {
        this.ciudad = ciudad;
    }        
    
    @Override
    public String getName() {
        return ciudad.getName();
    }

    @Override
    public double getTemperature() {
        return ciudad.getTemperature() * 1.8 + 32;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return ciudad.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        ciudad.setHasWeatherWarning(hasWeatherWarning);
    }
    
}
