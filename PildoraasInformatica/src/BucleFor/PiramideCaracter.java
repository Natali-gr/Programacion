package BucleFor;

import java.util.Scanner;

public class PiramideCaracter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
        pedir por teclado. El carácter con el que se pinta la pirámide también se debe
        pedir por teclado.*/

        System.out.println("ingrese un número para la altura del triángulo:");
        int altura=sc.nextInt();
        System.out.println("ingrese un carácter para pintar la pirámide: ");
        char caracter=sc.next().charAt(0);


        for( int i=1; i<=altura; i++){
            for(int j=altura; j>i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i-1) ; k++){
                System.out.print(caracter);
            }
                System.out.println(" ");
        }
    }
}
