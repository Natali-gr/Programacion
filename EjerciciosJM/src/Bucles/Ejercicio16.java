package Bucles;

import java.rmi.Naming;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* Escriba un programa para ingresar los números que el usuario desee y al final el programa debe mostrar los números más grandes y más pequeños ingresados.*/

        System.out.print("ingrese números: ");
        int num = sc.nextInt();

        int mayor=num;
        int menor=num;
        int cont=0;

        while(num!=0) {

            if(cont>0) {
                System.out.print("ingrese números: ");
                num = sc.nextInt();
            }
            cont++;
            if(num>0) {
                if (num > mayor) {
                    mayor = num;
                } else {
                    if (num<menor) {
                        menor = num;

                    }
                }
            }
        }

        System.out.println("número mayor: "+mayor);
        System.out.print("número menor: "+menor);
    }
}