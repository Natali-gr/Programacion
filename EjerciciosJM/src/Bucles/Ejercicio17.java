package Bucles;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Escriba un programa para encontrar el número y la suma de todos los números enteros entre 100 y 200 que sean divisibles por 9.

        int suma=0;
        int divisibleSuma=0;
        String divisible=" ";

            for(int num=100;num<=200; num++){
                //num =101

            int numbk=num;

             while(numbk != 0){
                 int mood=numbk%10;
                 suma=suma+mood;
                 numbk=numbk/10;
             }


                if (suma%9==0){
                 divisible=divisible+num+", ";
                 divisibleSuma+=num;
             }
             suma=0;
        }
            System.out.println(divisible);
            System.out.println("Numeros: "+divisibleSuma);
    }
}