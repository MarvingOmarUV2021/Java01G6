package com.sic;

/******************************************************************
 * Uso de Operadores de Asignación Compuesta en Java
 * Autor: Marving
 * Fecha: 7 de mayo de 2022
 ******************************************************************/

import java.util.Scanner;  // permite usar Scanner (leer datos en la terminal)

public class EjemJava04 
{
    public static void main( String[] args )
    {
        byte val1, val2; 
        float val3;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIngrese va1:");
        val1 = entrada.nextByte();
        System.out.println("Ingrese val2:");
        val2 = entrada.nextByte();
        System.out.println("Ingrese val3:");
        val3 = entrada.nextFloat();

        val1 += val2;
        System.out.println("\n\tResultado de val1 += val2 ... "+ val1); 
        val1 -= val2;
        System.out.println("\n\tResultado de val1 -= val2 ... "+ val1); 
        val1 *= val2;
        System.out.println("\n\tResultado de val1 *= val2 ... "+ val1); 
        val3 /= val2;
        System.out.println("\n\tResultado de val3 /= val2 ... "+ val3); 
        val3 %= val1;
        System.out.println("\n\tResultado de val3 %= val1 ... "+ val3); 
        
        System.out.println("\n");
    }
}
