package Bucles;
import java.util.Scanner;
public class Ejercicio22 {
Scanner sc= new Scanner(System.in);
    public static int longitud(int num){
      int contar=0;

        while(num != 0){
            int mood=num%10;
            contar++;
            num=num/10;
        }
        return contar;
    }

    public static void main(String[] args){

        Scanner teclado=new Scanner(System.in);
        /*
        Escriba un programa para convertir un número binario en un número decimal sin usar una matriz, una función ni un bucle while.
        */

   System.out.print("Ingresar un binario: ");
   int binario=teclado.nextInt();
    // 101101
        int bk=binario;
        int longitud=longitud(binario);
        int probando=0;

        for(int i=0; i < longitud; i++){

           if (binario != 0) {
               int mood = binario % 10;
                   probando = probando+(int) (mood*Math.pow(2,i));
               binario = binario / 10;
           }
        }

        System.out.println("Resultado del binario "+bk+" es "+probando);

    }
}