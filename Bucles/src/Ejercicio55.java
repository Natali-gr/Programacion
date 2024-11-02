import java.util.Scanner;
public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos un número
        System.out.print("ingrese un número: ");
        int numero = sc.nextInt();

        // Variable para almacenar el número invertido
        int numeroInvertido = 0;

        // Invertir el número
        while (numero != 0) {
            // Obtener el último dígito
            int digito = numero % 10;
            // Agregar el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;
            // Eliminar el último dígito del número original
            numero /= 10;
        }

        // Mostrar el número invertido
        System.out.println("El número al revés es: " + numeroInvertido);
    }
}
