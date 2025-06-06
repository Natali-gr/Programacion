import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;
public class EjercicioNumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        /*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
            también la suma total (los puntos que suman entre los tres dados).
        int dado1 = random.nextInt(10) + 1;
        int dado2 = random.nextInt(10) + 1;
        int dado3 = random.nextInt(10) + 1;
        int suma=dado1+dado2+dado3;
        System.out.println("tirada de dardos");
        System.out.println("dado 1: "+dado1);
        System.out.println("dado 2: "+dado2);
        System.out.println("dado 3: "+dado3);
        System.out.print("suma total: "+suma);*/

        /*Realiza un programa que muestre al azar el nombre de una carta de la
         baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
        diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
        cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
        sería el 1). Para convertir un número en una cadena de caracteres podemos
        usar String.valueOf(n).
        // Definir los palos de la baraja
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        // Definir los valores de las cartas
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // Seleccionar un palo y un valor al azar
        String paloAleatorio = palos[random.nextInt(palos.length)];
        String valorAleatorio = valores[random.nextInt(valores.length)];

        // Mostrar la carta seleccionada
        System.out.println("La carta seleccionada es: " + valorAleatorio + " de " + paloAleatorio);*/


       /*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
            separados por espacios. Muestra también el máximo, el mínimo y la media
            de esos números.
        int cantidadNumeros = 50;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int suma = 0;
        System.out.println("50 números enteros aleatorios entre 100 y 199:");

        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(100) + 100; // Genera número entre 100 y 199
            System.out.print(numeroAleatorio + " ");

            if (numeroAleatorio < min) {
                min = numeroAleatorio;
            }
            if (numeroAleatorio > max) {
                max = numeroAleatorio;
            }

            suma += numeroAleatorio;
        }

        double media = (double) suma / cantidadNumeros;
            System.out.println("\nnúmero máximo: "+max);
            System.out.println("número mínimo: "+min);
            System.out.print("la media es: "+media);
         */

        


    }
}
