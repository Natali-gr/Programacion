package Bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para imprimir tablas.

        System.out.print("ingrese un número para multiplicar: ");
        int numero=sc.nextInt();
        System.out.print("hasta que número quiere multiplicar:" );
        int multiplicador=sc.nextInt();
        System.out.println("tabla de multiplicar del "+numero+" :");

        /*for(int i=1; i<=multiplicador; i++){
            int resultado=numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }*/
        int i=1;
        while(i<=multiplicador){
            int resultado=numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);
            i++;
        }
    }
}
