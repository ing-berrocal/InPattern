/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.prototype;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(10, 20);
        
        Point clonado = (Point)point.clone();
        System.out.println(clonado.getX()+" : "+clonado.getY());
    }
}
