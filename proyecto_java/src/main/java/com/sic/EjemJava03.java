package com.sic;

/******************************************************************
 * Uso de Operadores Lógicos en Java
 * Uso de Scanner (lectura de datos en la Terminal)
 * Autor: Marving
 * Fecha: 6 de mayo de 2022
 ******************************************************************/

import java.util.Scanner;  // permite usar Scanner (leer datos en la terminal)

public class EjemJava03 
{
    public static void main( String[] args )
    {
        int val1; 
        int val2; 
        int val3; 
        boolean resAnd;
        boolean resOr;
        boolean resNot;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIngrese el 1er número:");
        val1 = entrada.nextInt();
        System.out.println("Ingrese el 2o  número:");
        val2 = entrada.nextInt();
        System.out.println("Ingrese el 3er número:");
        val3 = entrada.nextInt();

        resAnd = val1 == 6 && val2 >  2;
        resOr  = val2 >= 3 || val3 <= 8; 
        resNot = !( val1 == 2);

        System.out.println("\n\tResultado-And (¿ Es val1=6 y val2>2 ?)..... "+ resAnd); 
        System.out.println("\n\tResultado-Or  (¿ Es val2>=3 o val3<=8 ?)... "+ resOr); 
        System.out.println("\n\tResultado-Not (¿ No es val1 = 2 ?)......... "+ resNot);
        System.out.println("\n");
    }
}
