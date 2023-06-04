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
public class InterpreterDriver {
    // class variables
    public Conversion originatingContent = null;
    public Expression theExpression = null;

    public InterpreterDriver(Conversion content) {
        originatingContent = content;
    }

    public void interpret(String tString) {

        Scanner in = new Scanner(System.in);
        theExpression = new MapIntToCharacters(tString);
        theExpression.interpret(originatingContent);
    }
}
