import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Realiza un programa que diga si un número entero positivo introducido por
        teclado es capicúa. Se permiten números de hasta 5 cifras.*/

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();

        if(num>0 && num<99999) {
            int original = num;
            int inverso = 0;

            while (num > 0) {
                int digito = num % 10;
                inverso = inverso * 10 + digito;
                num = num/10;
            }

            if (original == inverso) {
                System.out.println("El número " + original + " es capicúa.");
            } else {
                System.out.println("El número " + original + " no es capicúa.");
            }
        }
    }
}
