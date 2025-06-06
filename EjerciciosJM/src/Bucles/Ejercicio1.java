package Bucles;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para imprimir todos los números naturales del 1 al n.

        System.out.print("Ingrese un número: ");
        int num=sc.nextInt();

        /*for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }*/
       /* int i=1;
        while(i<=num){
            System.out.print(i+" ");
            i++;
        }*/
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=num);
    }
}
