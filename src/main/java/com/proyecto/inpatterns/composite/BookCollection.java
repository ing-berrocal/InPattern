package com.proyecto.inpatterns.composite;

import java.util.ArrayList;

public class BookCollection implements LibraryOperation{

  private ArrayList<Book> collection = new ArrayList();  

  public void addBook(Book nonfictionBook) {
    this.collection.add(nonfictionBook);
  }

  @Override
  public void checkout() {
    this.collection.forEach(Book::checkout);    
  }

  @Override
  public void returnBook() {
    this.collection.forEach(Book::returnBook);    
  }


}
