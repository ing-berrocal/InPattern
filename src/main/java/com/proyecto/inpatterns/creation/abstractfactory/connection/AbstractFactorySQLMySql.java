/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.abstractfactory.connection;

import com.proyecto.inpatterns.creation.abstractfactory.util.ConnectionDB;
import com.proyecto.inpatterns.creation.abstractfactory.util.CreationConnectionSQL;
/**
 *
 * @author DELL
 */
public class AbstractFactorySQLMySql implements AbstractFactory{

    @Override
    public ConnectionDB getConnectionDB(ParamValues paramValues) {
        return CreationConnectionSQL.getInstance(
                paramValues.jdbcURL(), 
                paramValues.user(),
                paramValues.password(),
                "com.mysql.cj.jdbc.Driver"
                );
    }

    @Override
    public RepoConsult getRepoConsult() {
        return new RepoConsultSQLPostgres();
    }

    @Override
    public PersistenceObject getPersistenceObject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersistenceObject'");
    }

}
