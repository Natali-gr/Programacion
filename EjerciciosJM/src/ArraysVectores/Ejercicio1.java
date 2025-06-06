package ArraysVectores;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Escribe un programa que declare un array de 5 números enteros, los inicialice con valores dados y calcule la suma de todos sus elementos.

        int [] numeroArray =new int[5];
       /* numeroArray[0]=15;
        numeroArray[1]=2;
        numeroArray[2]=25;
        numeroArray[3]=12;
        numeroArray[4]=7;

        int suma;
        suma=numeroArray[4]+ numeroArray[4] + numeroArray[4];

        System.out.print(suma);*/

        int suma=0;
        System.out.println("ingrese "+numeroArray.length+" números para guardar: ");

        for (int i=0; i<numeroArray.length; i++){
               System.out.print("[ "+i +" ] = ");
               numeroArray[i] =sc.nextInt();

           //    suma=suma+numeroArray[i];
        }

/*
        for (int j=0; j<numeroArray.length; j++){
            suma=suma+numeroArray[j];
        }*/

        suma=numeroArray[4]+ numeroArray[4] + numeroArray[4];


        System.out.print(suma);
    }
}
