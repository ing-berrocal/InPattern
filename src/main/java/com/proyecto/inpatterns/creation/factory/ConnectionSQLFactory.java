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

    enum SQLTypes{
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
    public CreationConnectionSQL getConnectionSQL(
            SQLTypes type,
            String url,
            String username,
            String password
            ){
        
        return switch (type) {
            case SQLLite -> new CreationConnectionSQLSQLite(url, username, password);                
            case Postgres -> new CreationConnectionSQLPostgres(url, username, password);                
            case MySql -> new CreationConnectionSQLMySQL(url, username, password);                
            default -> throw new AssertionError();
        };
    }
}