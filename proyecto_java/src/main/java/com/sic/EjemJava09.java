package com.sic;

/******************************************************************
 * Uso de Estructura de Control If-Else en Java
 * Autor: Marving
 * Fecha: 7 de mayo de 2022
 ******************************************************************/

public class EjemJava09 
{
    public static void main( String[] args )
    {
        byte num = -128;
        System.out.println("\n\tLista de todos los valores de num que es tipo BYTE");
        do
        {
            System.out.println("\tEl valor de num es: " + num );
            num++;
        }
        while(num<=126);
        System.out.println("\tEl valor de num es: " + num );
    }
}
