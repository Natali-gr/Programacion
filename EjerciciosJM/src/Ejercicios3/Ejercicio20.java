package Ejercicios3;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado.

        System.out.print("ingrese el precio del articulo: ");
        double articulo=sc.nextDouble();
        System.out.print("ingrese el precio de venta real: ");
        double ventaReal=sc.nextDouble();

        int descuento;

                descuento= (int) ((ventaReal/articulo)*100);

        System.out.print("el descuento aplicado es de: "+descuento+" %");

    }
}
