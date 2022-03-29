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
public class Main {
   
    public static void main(String[] args) {
        TextOperation txt = new TextOperation();
        
        Command cmdOpen = new CommandOpen(txt);
        Command cmdClose = new CommandClose(txt);
        
        cmdOpen.execute();
        cmdClose.execute();
    }        
    
}
