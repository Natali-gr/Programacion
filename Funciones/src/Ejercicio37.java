import java.util.Scanner;
public class Ejercicio37 {
    /*Realiza un programa que pida una frase y muestre el número de caracteres de la
    misma:
    a. Desde el código de una función.
    b. Devolviendo desde la función al programa principal el dato*/
    // Función para contar el número de caracteres de una frase
    public static int contarCaracteres(String frase) {
        return frase.length();  // Devuelve la longitud de la frase
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir una frase al usuario
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        // Llamar a la función para contar los caracteres
        int numeroCaracteres = contarCaracteres(frase);

        // Mostrar el número de caracteres
        System.out.println("El número de caracteres en la frase es: " + numeroCaracteres);

        sc.close();
    }
}
