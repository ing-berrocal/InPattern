/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.abstractfactory.connection;

import com.proyecto.inpatterns.creation.abstractfactory.util.ConnectionDB;
                                                                                                                                                       
/**
 *
 * @author DELL
 */
public interface AbstractFactory {
    
    ConnectionDB getConnectionDB(ParamValues paramValues);
    RepoConsult getRepoConsult();
    PersistenceObject getPersistenceObject();
    
    public record ParamValues(
            String jdbcURL,
            String user,
            String password
            ){};
    
    
}
