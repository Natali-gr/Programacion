import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Imprimir números primos hasta 100:
        Escribe un programa que imprima todos los números primos entre 1 y 100 usando bucles while.*/

        int i=2;

        System.out.print("Números primos entre 1 y 100:");
        while(i<=100){
            boolean esPrimo=true;

            int divisor=2;

            while(divisor*divisor<=i){
                if(i%divisor==0){
                    esPrimo=false;
                }
                divisor++;
            }

            if(esPrimo){
                System.out.print(i+" ,");
            }
            i++;
        }
    }
}
