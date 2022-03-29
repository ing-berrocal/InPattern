/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.factory;

import com.proyecto.inpatterns.creation.util.Producto;

/**
 *
 * @author DELL
 */
public interface ProductFactory {
    Producto getProducto(ProductType tipo);
}
