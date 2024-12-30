import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Realiza un programa que nos diga cuántos dígitos tiene un número entero que
        puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.*/

        System.out.print("ingrese un número: ");
        int num=sc.nextInt();
        int positivo=0;
        int negativo=0;
        int digitos=0;

        if(num >= -99999 && num<= 99999) {
            //convierte el número en positivo
            int numeroAbsoluto = Math.abs(num);

            if (numeroAbsoluto < 10) {
                digitos = 1;
            } else if (numeroAbsoluto < 100) {
                digitos = 2;
            } else if (numeroAbsoluto < 1000) {
                digitos = 3;
            } else if (numeroAbsoluto < 10000) {
                digitos = 4;
            } else {
                digitos = 5;
            }
            System.out.print("el número introducido tiene " + digitos + " digitos");
        }
    }
}
