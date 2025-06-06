package Ejercicios2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Un economista te ha encargado un programa para realizar cálculos con el IVA.
        La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
         Muestra en pantalla el importe correspondiente al IVA y al total.*/

        System.out.print("ingrese la base imponible: ");
        double base= sc.nextInt();
        System.out.print("ingrese el iva: ");
        double iva=sc.nextInt();

        double ivaTotal=base * (iva/100);
        double precioTotal=base + ivaTotal;

        System.out.println("el iva es: "+ivaTotal);
        System.out.println("el total es: "+ precioTotal);

    }
}
