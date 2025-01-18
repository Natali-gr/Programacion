import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Calcula el promedio de una serie de números: Solicita al usuario que introduzca números uno por uno y calcula el promedio.
        El programa termina cuando el usuario introduce -1.
        Ejemplo: Si ingresa 5, 10 y -1, el promedio es 7.5.*/
        double suma = 0;
        int contador = 0;
        double numero;
        boolean validando = false;
        double promedio=0;

        while (!validando) {
            System.out.print("ingresa un número (-1 para terminar): ");
            numero = sc.nextDouble();

            if (numero == -1) {
                validando = true;

            } else {
                suma = suma + numero;
                contador++;
                promedio = suma / contador;
            }
        }

        if (suma > 0) {
            System.out.println("el promedio es: " + promedio);
        } else {
            System.out.println("no se introdujeron números para calcular el promedio.");
        }
    }
}

// reaizar seguimiento de la condicional suma o con contador

