package com.sic;

/******************************************************************
 * Uso de Operadores Relacionales en Java
 * Autor: Marving
 * Fecha: 6 de mayo de 2022
 ******************************************************************/
public class EjemJava02 
{
    public static void main( String[] args )
    {
        int valor1 = 10; 
        int valor2 = 7; 
        int valor3 = 20; 
        boolean result1, result2, result3; 
        result1 = (valor1 == valor2); 
        result2 = (valor2 > valor3); 
        result3 = (valor1<= valor3); 
        System.out.println("\n\tResult1 (¿ Es 10 = 7 ?)..... "+ result1); 
        System.out.println("\n\tResult2 (¿ Es 7 > 20 ?)..... "+ result2); 
        System.out.println("\n\tResult3 (¿ Es 10 <= 20 ?)... "+ result3);
        System.out.println("\n");
    }
}
