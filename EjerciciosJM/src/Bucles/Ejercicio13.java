package Bucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para comprobar si un número dado es primo o no.

        System.out.print("ingresa un número: ");
        int num=sc.nextInt();
        int contador=0;

        for(int i=2; i<num; i++){
            if (num%i==0){
                contador++;
            }
        }
        if (contador >=1){
            System.out.print("no es primo");
        }else {
            System.out.print("es primo");
        }
    }
}
