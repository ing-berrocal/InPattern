/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.abstractfactory.connection;

import java.util.List;

import com.proyecto.inpatterns.creation.abstractfactory.util.ConnectionDB;

/**
 *
 * @author DELL
 */
interface PersistenceObject<T> {
    
    void init(ConnectionDB db, RepoConsult consult);
    
    public List<T> getResult();
}
