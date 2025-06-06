package Ejercicios3;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Escribe un programa que lea 2 números y los visualice en orden ascendente

        System.out.print("ingrese 2 números: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int menor=0;
        int mayor=0;

        if(num1<num2){
            menor=num1;
      //      mayor=num2;
        }else{
            menor=num2;
        //    mayor=num1;
        }

        System.out.print(menor+" ,"+mayor);

    }
}
