package Ejercicios3;
import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta decisión:
         si está lloviendo y si hemos terminado nuestras tareas. Solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas.
         Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de que tengamos que ir a la biblioteca.
         Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
         El algoritmo debe mostrar mediante un booleano si es posible que se le otorgue permiso para ir a la calle.*/

        System.out.println("¿Está lloviendo? (true/false): ");
        boolean lloviendo = sc.nextBoolean();

        System.out.println("¿Has finalizado tus tareas? (true/false): ");
        boolean tareasTerminadas = sc.nextBoolean();

        System.out.println("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean irBiblioteca = sc.nextBoolean();

        // Lógica de decisión
        boolean puedeSalir = (!lloviendo && tareasTerminadas) || irBiblioteca;

        // Mostrar resultado
        System.out.println("¿Puedes salir a la calle?: " + puedeSalir);

    }
}
