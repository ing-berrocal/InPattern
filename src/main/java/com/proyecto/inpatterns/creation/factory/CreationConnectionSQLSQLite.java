/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.factory;

/**
 *
 * @author DELL
 */
public class CreationConnectionSQLSQLite extends CreationConnectionSQL{

    public CreationConnectionSQLSQLite(String jdbcUrl, String username, String password) {
        super(jdbcUrl, username, password,"");
    }
        
    public boolean isConnected(){
        return Boolean.FALSE;
    } 
}
