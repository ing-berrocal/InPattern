/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.inpatterns.creation.abstractfactory.connection;

/**
 *
 * @author DELL
 */
class RepoConsultSQLPostgres implements RepoConsult {

    @Override
    public String getConsult() {
        return "SELECT FROM ";
    }
}