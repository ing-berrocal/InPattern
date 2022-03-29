/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.util;

import java.math.BigDecimal;

/**
 *
 * @author DELL
 */
public class LineaTasaUsura implements TasaUsura{

    @Override
    public BigDecimal getTasa() {
        return BigDecimal.ONE;
    }
    
}
