package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args )
    {
        Person persona1 = new Person("Pedro", " Picadiedras");
        persona1.introduceYourself(persona1);
        Person persona2 = new Person("Pablo", " Marmol");
        persona2.introduceYourself(persona2);
        Person persona3 = new Person("Vilma", " Picadiedras");
        persona3.introduceYourself(persona3);
        Person persona4 = new Person("Betty", " Marmol");
        persona4.introduceYourself(persona4);

        System.out.println("Cuatro personas creadas");
    }
}
