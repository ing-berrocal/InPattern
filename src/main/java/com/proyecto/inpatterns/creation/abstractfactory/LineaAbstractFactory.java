/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.abstractfactory;

import com.proyecto.inpatterns.creation.util.LineaObligacion;
import com.proyecto.inpatterns.creation.util.LineaProducto;
import com.proyecto.inpatterns.creation.util.LineaTasaUsura;
import com.proyecto.inpatterns.creation.util.Obligacion;
import com.proyecto.inpatterns.creation.util.Producto;
import com.proyecto.inpatterns.creation.util.TasaUsura;

/**
 *
 * @author DELL
 */
public class LineaAbstractFactory implements AbstractFactory{

    @Override
    public Obligacion getObligacion() {
        return new LineaObligacion();
    }

    @Override
    public TasaUsura getTasaUsura() {
        return new LineaTasaUsura();
    }

    @Override
    public Producto getProducto() {
        return new LineaProducto();
    }
    
}
