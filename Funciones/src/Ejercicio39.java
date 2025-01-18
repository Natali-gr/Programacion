import java.util.Random;
import java.util.Scanner;
public class Ejercicio39 {
    /*Hacer un juego de dados. Al principio el usuario dirá de cuánto quiere que sea el
    dado con el que se jugará. Y después se hará la tirada del usuario y la del ordenador,
    dando el resultado y diciendo quién gana. Utilizar las funciones que se consideren
    oportunas.*/
    // Función para realizar la tirada de un dado
    public static int tirarDado(int maxValor) {
        Random rand = new Random();
        return rand.nextInt(maxValor) + 1;  // Genera un número entre 1 y maxValor
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el valor máximo del dado
        System.out.print("¿De cuánto quieres que sea el dado? (ej. 6 para un dado de 6 caras): ");
        int maxValor = sc.nextInt();

        // Realizar las tiradas
        int tiradaUsuario = tirarDado(maxValor);
        int tiradaComputadora = tirarDado(maxValor);

        // Mostrar los resultados
        System.out.println("Tu tirada: " + tiradaUsuario);
        System.out.println("Tirada de la computadora: " + tiradaComputadora);

        // Determinar quién gana
        if (tiradaUsuario > tiradaComputadora) {
            System.out.println("¡Has ganado!");
        } else if (tiradaUsuario < tiradaComputadora) {
            System.out.println("La computadora ha ganado.");
        } else {
            System.out.println("Es un empate.");
        }

        sc.close();
    }
}
