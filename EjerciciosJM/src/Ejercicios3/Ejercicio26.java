package Ejercicios3;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Escribe un programa que pinte por pantalla una pirámide rellena a base de asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
    System.out.print("ingrese el número de filas que quieres que sea el triángulo: ");
    int num=sc.nextInt(); //num=5

    int n=1;

        for(int i=0; i <num; i++) {  //filas

        for (int j = num - 1; j > i; j--) { //espacio
            System.out.print(" ");
        }

        for (int k = 1; k <= n; k++) {

            if (i != num - 1) {

                if (k == 1 || k == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }else{
                System.out.print("*");
            }
        }

        n=n+2;

        System.out.println(" ");
        }
    }
}