/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.proyecto.inpatterns.creation.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class ConnectionSQLFactoryTest {
    
    CreationConnectionSQL result;
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getConnectionSQL method, of class ConnectionSQLFactory.
     */
    @Test
    public void testGetConnectionPostgres() {
        
        String url = "jdbc:postgresql://192.168.1.23:5432/postgres";
        String username = "postgres";
        String password = "password";

        ConnectionSQLFactory.SQLTypes type = ConnectionSQLFactory.SQLTypes.Postgres;
        CreationConnectionSQL result = ConnectionSQLFactory.getConnectionSQL(type, url, username, password);
        
        result.connect();
    
        Assertions.assertTrue(result.isConnected());
        
        result.close();
    }
    
}
