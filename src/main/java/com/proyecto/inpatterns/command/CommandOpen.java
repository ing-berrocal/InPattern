/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.command;

/**
 *
 * @author DELL
 */
public class CommandOpen implements Command{

    private final TextOperation operation;

    public CommandOpen(TextOperation operation) {
        this.operation = operation;
    }
    
    
    @Override
    public void execute() {
        operation.open();
    }
    
}
