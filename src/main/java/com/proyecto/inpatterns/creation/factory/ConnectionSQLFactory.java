/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.factory;

/**
 *
 * @author DELL
 */
public class ConnectionSQLFactory {

    public enum SQLTypes{
        SQLLite,
        Postgres,
        MySql,
        Oracle,
        SQLServer;
    };
    public ConnectionSQLFactory(){
    }

    /**
     *
     * @param type
     * @param url
     * @param username
     * @param password
     * @return
     */
    public static CreationConnectionSQL getConnectionSQL(
            SQLTypes type,
            String url,
            String username,
            String password
            ){
        
        return switch (type) {
            case SQLLite ->     new CreationConnectionSQL(url, username, password,"com.mysql.cj.jdbc.Driver");
            case Postgres ->    new CreationConnectionSQL(url, username, password,"org.postgresql.Driver");
            case MySql ->       new CreationConnectionSQL(url, username, password,"com.mysql.cj.jdbc.Driver");              
            default -> throw new AssertionError();
        };
    }
}