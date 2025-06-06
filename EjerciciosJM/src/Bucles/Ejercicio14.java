package Bucles;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para calcular el MCD de dos números dados

        System.out.println("ingrese 2 números para sacar el MCD: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int aux=0;

// num1=65  num2=128

        if(num1<num2) {
            aux = num2; // aux 128
            num2 = num1; // num2 65
            num1 = aux; // 128
        }

        int mood=num1%num2;

        if(mood !=0) {
            int mood2 = num2 % mood;

            while (mood2 !=0){
                int nuevoMood=mood%mood2;
                mood=mood2;
                mood2=nuevoMood;
            }
        }

            System.out.print("el MCD es: "+mood);
    }
}
