package BucleFor;

import java.util.Scanner;

public class PideNumeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Realiza un programa que vaya pidiendo números hasta que se introduzca un
        numero negativo y nos diga cuantos números se han introducido, la media de
        los impares y el mayor de los pares. El número negativo sólo se utiliza para
        indicar el final de la introducción de datos pero no se incluye en el cómputo*/

        int num=0;
        int cont=0;
        int maxPar=Integer.MIN_VALUE;
        double media=0;
        int sumaImpar=0;
        int cuentaImpares=0;
        int par=0;
        do{
            System.out.println("ingrese un número positivo o negativo para terminar:");
            num=sc.nextInt();
            if (num > 0) {
                cont++;
                if(num%2==1){
                    sumaImpar=sumaImpar+num;
                    cuentaImpares++;
                }else if(num>maxPar){
                    maxPar=num;
                }

                media=(double) sumaImpar/cuentaImpares;
            }

        }while(num>0);

        System.out.println("se han introducido "+cont+" números");
        System.out.println("la media de los impares es: "+media);
        System.out.println("el mayor de los pares es: "+maxPar);
    }
}
