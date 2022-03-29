/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.builder;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        
        Cita cita = new Cita.
                Builder()
                .setNombres("Alberto Andres")
                .setApellidos("Pepe Perez")
                .setFechas(LocalDate.MIN, LocalDate.MAX)
                .build();
        
        System.out.println(cita.getNombres());
    }
}
