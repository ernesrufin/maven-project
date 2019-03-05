package com.example;


public class Greeter {

  
  public Greeter() {

  }
  
  /**
  * @param nom de personne
  * @return afficher le nom
  */

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
