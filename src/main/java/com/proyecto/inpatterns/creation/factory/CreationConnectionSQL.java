/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class CreationConnectionSQL {

    private final String jdbcUrl;
    private final String username;
    private final String password;
    private final String driver;

    private Connection connection;
    
    private Boolean isConnected = Boolean.FALSE;

    CreationConnectionSQL(String jdbcUrl, String username, String password, String driver) {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
        this.driver = driver;
    }

    public void connect() {
        try {
            System.out.println("Conectando....");
            Class.forName(this.driver);
            connection = DriverManager.getConnection(this.jdbcUrl,
                    this.username,
                    this.password);
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Operation done successfully");
    }
    
    public boolean isConnected(){ 
        return isConnected;
    }
    
    public void close(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(CreationConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}