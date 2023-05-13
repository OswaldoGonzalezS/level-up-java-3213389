package com.linkedin.javacodechallenges;

public class Person {
  String firstName;
  String lastName;

  
  public Person() {
  }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("creado ==> " + this.firstName);

  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public void introduceYourself (Person p1){
    System.out.println("Hola soy: " + this.firstName + "he sido creado");

  }
}