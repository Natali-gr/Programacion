import  java.util.Scanner;
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos la altura de la pirámide
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        // Solicitamos el carácter con el que se pintará la pirámide
        System.out.print("Introduce el carácter para pintar la pirámide: ");
        char caracter = sc.next().charAt(0);

        System.out.println();

        // Pintar la pirámide
        for (int i = 1; i <= altura; i++) {
            // se imprime espacios antes de cada fila para centrar la pirámide
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }

            //se imprime el carácter
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(caracter);
            }

            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
}
