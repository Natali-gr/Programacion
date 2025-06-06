package Bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para encontrar el valor factorial de cualquier número

        System.out.print("ingrese un número para calcular su factorial: ");
        int num=sc.nextInt();

        int factorial=1;
        for(int i=num; i>=1; i--){
            factorial=factorial*i;
                System.out.print(i);
            if(i>1){
                System.out.print("*");
            }
        }
        System.out.print("="+factorial);

    }
}
