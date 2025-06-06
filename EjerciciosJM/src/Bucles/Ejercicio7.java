package Bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();

        int suma=0;
        for(int i=1; i<=num; i++){
            if(i%2==0) {
                suma = suma + i;
                    System.out.print(i);
                if(i<num ){
                    System.out.print(" + ");
                }
            }
        }
        System.out.print(" = "+suma);
    }
}
