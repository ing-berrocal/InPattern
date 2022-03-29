/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.factory;

import com.proyecto.inpatterns.creation.util.LineaProducto;
import com.proyecto.inpatterns.creation.util.Producto;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactoryImp();
        
        Producto producto = factory.getProducto(ProductType.LINEA);
        
        if(producto instanceof LineaProducto){
            System.out.println("Linea de producto");
        }
        
        producto = factory.getProducto(ProductType.TRIANGULO);
        
        if(producto instanceof LineaProducto){
            System.out.println("Linea de producto");
        }else{
            System.out.println("No es linea de producto");
        }
    }
}
