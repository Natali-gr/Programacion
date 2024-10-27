import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa el caracter para pintar la pirámide: ");
        char caracter = sc.next().charAt(0);

        // Mostramos el menú para seleccionar la dirección
        System.out.println("Elige la dirección de la pirámide:");
        System.out.println("1. Vértice hacia arriba");
        System.out.println("2. Vértice hacia abajo");
        System.out.println("3. Vértice hacia la izquierda");
        System.out.println("4. Vértice hacia la derecha");
        System.out.print("Ingresa tu elección (1-4): ");
        int opcion = sc.nextInt();

        System.out.println();
        int altura = 5;

        switch(opcion) {
            case 1:
                // Vértice hacia arriba
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < altura - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < (2 * i + 1); k++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Vértice hacia abajo
                for (int i = altura - 1; i >= 0; i--) {
                    for (int j = 0; j < altura - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < (2 * i + 1); k++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;

            case 3:
                // Vértice hacia la izquierda
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < altura - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                for (int i = altura - 2; i >= 0; i--) {
                    for (int j = 0; j < altura - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;

            case 4:
                // Vértice hacia la derecha
                for (int i = 0; i < altura; i++) {
                    for (int k = 0; k <= i; k++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                for (int i = altura - 2; i >= 0; i--) {
                    for (int k = 0; k <= i; k++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Opción no válida, elige entre 1 y 4");
        }
    }
}
