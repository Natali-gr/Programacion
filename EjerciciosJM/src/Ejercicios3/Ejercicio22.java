package Ejercicios3;

import java.lang.constant.ClassDesc;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros.
        Sabiendo que una milla marina equivale a 1852 metros.*/

        System.out.print("ingrese el valor de la distancia en millas: ");
        int distanciaMilla=sc.nextInt();

        int metros=1852;

        int rmetro=distanciaMilla*metros;

        System.out.print("la distancia en metros es: "+rmetro);
    }
}
