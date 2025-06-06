package BucleFor;

import java.util.Scanner;

public class NumPrimo100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos

        for(int num=2; num<=100; num++){
            boolean esPrimo=true;
            for(int i=2; i<=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                    }
                }
                if (esPrimo){
                System.out.print(num+" ");
            }
        }
    }
}
