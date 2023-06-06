/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.abstractfactory.connection;

import java.util.List;

import com.proyecto.inpatterns.creation.abstractfactory.util.ConnectionDB;
import com.proyecto.inpatterns.util.modelo.Product;

/**
 *
 * @author DELL
 */
public class PersistenceObjectPostgres implements PersistenceObject<Product>{

    @Override
    public void init(ConnectionDB db, RepoConsult consult) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'init'");
    }

    @Override
    public List<Product> getResult() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResult'");
    }
    
}
