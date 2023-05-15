package com.linkedin.javacodechallenges;
import java.time.LocalDate;
import java.util.*;


public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now
    public static LocalDate calcFechaMasCien(){
    LocalDate fechaActual = LocalDate.now();
    LocalDate fechaNueva = fechaActual.plusDays(100);
    LocalDate fechaNuev1 = fechaActual.plusMonths(3);
    return fechaNueva;
    };
    public static void main( String[] args )
    {
        System.out.println("100 days from now is... " + calcFechaMasCien());
        
            /* add function call */;
    }
}
