/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.factory;

import com.proyecto.inpatterns.creation.util.CircularProducto;
import com.proyecto.inpatterns.creation.util.LineaProducto;
import com.proyecto.inpatterns.creation.util.Producto;
import com.proyecto.inpatterns.creation.util.TriangularProducto;

/**
 *
 * @author DELL
 */
public class ProductFactoryImp implements ProductFactory{

    @Override
    public Producto getProducto(ProductType tipo) {
        if(null == tipo){
            throw new RuntimeException();
        }else switch (tipo) {
            case LINEA:
                return new LineaProducto();
            case TRIANGULO:
                return new TriangularProducto();
            case CIRCULO:
                return new CircularProducto();
            default:
                throw new RuntimeException();
        }
    }
    
}
