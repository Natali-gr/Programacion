import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedir que ingrese un número para calcular su factorial
        System.out.print("ingresa un número para calcular su factorial: ");
        int num= sc.nextInt();

        // se comprueba si es negativo
        if (num < 0) {
            System.out.println("ingresa un número positivo");
        } else {
           double factorial = 1;

            // Calculamos del factorial
            for (int i = 1; i <= num; i++) {
                factorial =factorial * i;
            }

            //mostramos el resultado
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
    }
}
