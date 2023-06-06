/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.abstractfactory.util;

/**
 *
 * @author DELL
 */
public abstract class ConnectionDB {
    
    protected final String jdbcUrl;
    protected final String username;
    protected final String password;

    public ConnectionDB(String jdbcUrl, String username, String password) {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
    }
    
    public abstract void connect();
    
    public abstract void close();

}
