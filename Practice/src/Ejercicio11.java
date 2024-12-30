import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       /* Escribe un programa que diga cuál es la última cifra de un número entero
        introducido por teclado.*/

        System.out.print("ingrese un número");
        int num=sc.nextInt();


        if(num>0){;
            int ultimaCifra=num%10;
            System.out.print("la ultima cifra del número introducido es: "+ultimaCifra);
        }
    }
}
