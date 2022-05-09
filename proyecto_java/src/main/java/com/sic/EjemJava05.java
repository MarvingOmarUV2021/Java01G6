package com.sic;

/******************************************************************
 * Uso de Operadores de Aumento y Disminución en Java
 * Autor: Marving
 * Fecha: 7 de mayo de 2022
 ******************************************************************/

import java.util.Scanner;  // permite usar Scanner (leer datos en la terminal)

public class EjemJava05 
{
    public static void main( String[] args )
    {
        int val1, val2, val3;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIngrese val1:");
        val1 = entrada.nextInt();
                
        val2 = val1++;  // val2 = val1  ...  val1 = val1 + 1 
        System.out.println("\n\tResultado de val1 = val1 + 1 ... "+ val1);
        val2 = ++val1;  // val1 = val1 + 1  ...  val2 = val1 
        System.out.println("\n\tResultado de val2 = val1 = val1 + 1 ... "+ val2); 
        val3 = val1--;  // val3 = val1  ...  val1 = val1 - 1
        System.out.println("\n\tResultado de val1 = val1 - 1 ... "+ val1);
        val3 = --val1;  // val1 = val1 - 1  ...  val3 = val1
        System.out.println("\n\tResultado de val3 = val1 = val1 - 1 ... "+ val3); 
        
        System.out.println("\n");
    }
}
