package Bucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();

        int mood=0;
        String inverso=" ";
        int suma=0;

        while(num>0){
            mood=num%10;
            num=num/10;
            suma=suma+mood;
            System.out.print(mood);
            if(num>0){
                System.out.print(" + ");
            }
        }
        System.out.print(" = "+suma);
    }
}
