/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.abstractfactory;

import com.proyecto.inpatterns.creation.util.Obligacion;
import com.proyecto.inpatterns.creation.util.Producto;
import com.proyecto.inpatterns.creation.util.TasaUsura;

/**
 * Familia de objetos
 *
 * @author DELL
 */
public interface AbstractFactory {
    Obligacion getObligacion();
    TasaUsura getTasaUsura();
    Producto getProducto();
}
