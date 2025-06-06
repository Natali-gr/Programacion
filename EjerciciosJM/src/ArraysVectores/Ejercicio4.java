package ArraysVectores;

import java.lang.constant.ClassDesc;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Crea un programa que pida 10 números al usuario, los almacene en un array y luego muestre cuántos son pares y cuántos impares.

        int [] numeroArray= new int[10];

        int contPar=0,contImpar=0;

        System.out.println("ingrese 10 números: ");

        for (int i=0; i<numeroArray.length; i++){
             System.out.print("[ "+i+" ]= ");
            numeroArray[i]= sc.nextInt();
        }

        for (int j=0; j<numeroArray.length; j++){
            if (numeroArray[j]%2==0){
                contPar++;
            }else{
                contImpar++;
            }
        }
        System.out.println("pares: "+contPar);
        System.out.println("impares: "+contImpar);
    }
}
