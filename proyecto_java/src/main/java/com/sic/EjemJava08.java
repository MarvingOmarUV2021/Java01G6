package com.sic;

/******************************************************************
 * Uso de Estructura de Control If-Else en Java
 * Autor: Marving
 * Fecha: 7 de mayo de 2022
 ******************************************************************/

public class EjemJava08 
{
    public static void main( String[] args )
    {
        byte num = -128;
        System.out.println("\n\tLista de todos los valores de num que es tipo BYTE");
        System.out.println("\n\tEl valor de num es: " + num );
        while(num<127)
        {
            num++;
            System.out.println("\tEl valor de num es: " + num );
        }
    }
}
