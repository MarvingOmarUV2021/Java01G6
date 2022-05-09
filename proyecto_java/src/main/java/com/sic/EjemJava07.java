package com.sic;

/******************************************************************
 * Uso de Estructura de Control If-Else en Java
 * Autor: Marving
 * Fecha: 7 de mayo de 2022
 ******************************************************************/

import java.util.Scanner;  // permite usar Scanner (leer datos en la terminal)

public class EjemJava07 
{
    public static void main( String[] args )
    {
        byte val1;
        
        System.out.println("\n\tElige el mejor equipo de fútbol ... ");
        System.out.println("\n\t1.  BARCELONA");
        System.out.println("\t2.  CHIVAS");
        System.out.println("\t3.  MANCHESTER CITY");
        System.out.println("\t4.  PARIS SAINT-GERMAIN");
        System.out.println("\t5.  JUVENTUS");
        System.out.println("\t6.  BENFINCA");
        System.out.println("\t7.  BORUSSIA DORTMUND");
        System.out.println("\t8.  AJAX");
        System.out.println("\t9.  PSV");
        System.out.println("\t10. BAYERN MUNICH");
        System.out.println("\t11. PORTO");
        System.out.println("\t12. INTER DE MILÁN");
        System.out.println("\t13. MÓNACO");
        System.out.println("\t14. LIVERPOOL");
        System.out.println("\t15. NECAXA");
        System.out.println("\t16. REAL MADRID");

        Scanner entrada = new Scanner(System.in);
        val1 = entrada.nextByte();
        
        switch(val1){
            case 1:
                System.out.println("\n\tExcelente gusto !!! ");
                break;
            case 3:
                System.out.println("\n\tBuen gusto !!! ");
                break;
            case 5:
                System.out.println("\n\tBuen gusto !!! ");
                break;
            case 7:
                System.out.println("\n\tBuen gusto !!! ");
                break;
            case 9:
                System.out.println("\n\tBuen gusto !!! ");
                break;
            case 11:
                System.out.println("\n\tBuen gusto !!! ");
                break;
            case 13:
                System.out.println("\n\tBuen gusto !!! ");
                break;
            case 15:
                System.out.println("\n\tBuen gusto !!! ");
                break;
            default:
                System.out.println("\n\tEn serio ??? Has de ser basquetbolista ");
                break;
        }
        
        System.out.println("\n");
    }
}
