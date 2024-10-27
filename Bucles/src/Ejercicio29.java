import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //se pide   que ingrese un número para el tamaño del triángulo
        System.out.println("ingrese un número");
        int num=sc.nextInt();
        //definimos para q imprima el triángulo invertido
            for(int i=num; i>=1; i--){
                //por cada q se cumpla imprime un asterisco
                for(int j=1; j<=i; j++) {
                    System.out.print("* ");
                }//imprime un salto de línea
                System.out.println();
        }
    }
}
