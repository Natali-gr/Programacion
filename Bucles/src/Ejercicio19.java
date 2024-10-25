import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorCorrectas = 0;
        boolean seguirJugando = true;

        while (seguirJugando) {
            // Generamos dos números aleatorios entre 1 y 100
            int numero1 = (int)(Math.random()*101);
            int numero2 = (int)(Math.random()*101);

            // Mostramos la suma al jugador
            System.out.println("¿Cuánto es " + numero1 + " + " + numero2 + "?");

            // Leemos la respuesta del jugador
            int respuesta = sc.nextInt();

            // Verificamos si la respuesta es correcta
            if (respuesta == (numero1 + numero2)) {
                System.out.println("¡Correcto!");
                contadorCorrectas++;
            } else {
                System.out.println("Incorrecto. El juego ha terminado.");
                seguirJugando= false;
            }
        }

        // Mostramos el número de respuestas correctas al finalizar el juego
        System.out.println("Has realizado " + contadorCorrectas + " operaciones correctamente.");

    }
}
