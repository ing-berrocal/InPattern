/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.composite;

/**
 *
 * @author DELL
 */
public class Book implements LibraryOperation {

    private String name;
    private boolean checkedOut;

    public Book(String name, boolean checkedOut) {
        this.name = name;
        this.checkedOut = checkedOut;
    }

    public String getName() {
        return name;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    @Override
    public void checkout() {
        if (!checkedOut) {
            System.out.println("Checking out " + name + "\n");
            checkedOut = true;
        } else {
            System.out.println(name + " is already checked out\n");
        }
    }

    @Override
    public void returnBook() {
        if (checkedOut) {
            System.out.println("Returning " + name + "\n");
            checkedOut = false;
        } else {
            System.out.println(name + " is not checked out\n");
        }
    }

}
