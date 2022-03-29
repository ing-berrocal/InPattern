/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.abstractfactory;

import com.proyecto.inpatterns.creation.util.TriangularObligacion;
import com.proyecto.inpatterns.creation.util.TriangularProducto;
import com.proyecto.inpatterns.creation.util.TriangularTasaUsura;
import com.proyecto.inpatterns.creation.util.Obligacion;
import com.proyecto.inpatterns.creation.util.Producto;
import com.proyecto.inpatterns.creation.util.TasaUsura;

/**
 *
 * @author DELL
 */
public class TriangularAbstractFactory implements AbstractFactory{

    @Override
    public Obligacion getObligacion() {
        return new TriangularObligacion();
    }

    @Override
    public TasaUsura getTasaUsura() {
        return new TriangularTasaUsura();
    }

    @Override
    public Producto getProducto() {
        return new TriangularProducto();
    }
    
}
