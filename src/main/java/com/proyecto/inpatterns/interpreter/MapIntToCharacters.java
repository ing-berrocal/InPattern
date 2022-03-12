/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.interpreter;

/**
 *
 * @author DELL
 */
public class MapIntToCharacters implements Expression{

    // class variable
    private String tString;

    // constructor
    public MapIntToCharacters(String tString) {
        this.tString = tString;
    }

    @Override
    public void interpret(Conversion orignalContent) {
        orignalContent.convertToCharacters(tString);
    }
    
}
