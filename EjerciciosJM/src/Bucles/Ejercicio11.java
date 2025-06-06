package Bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escribe un programa para invertir los dígitos dados.

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();

        int mood=0;
        int division=0;
        String inverso=" ";

        while(num>0){
            mood=num%10;
            inverso=inverso+mood+" ";
            num=num/10;
        }
        System.out.print(inverso);
    }
}
