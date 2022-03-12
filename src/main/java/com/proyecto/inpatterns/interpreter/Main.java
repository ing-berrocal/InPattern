/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.interpreter;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args){
        System.out.println("\n\nCODE INTERPRETER\n");
        System.out.print("Enter your code: ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        System.out.println("Your code: " + userInput);
        Conversion conversion = new Conversion(userInput);
        InterpreterDriver userCode = new InterpreterDriver(conversion);
        userCode.interpret(userInput);
        System.out.println("\n\n");
    }
}
