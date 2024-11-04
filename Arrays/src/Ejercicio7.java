import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir un número al usuario
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Convertir el número en un array de dígitos
        String numeroStr = Integer.toString(Math.abs(numero)); // Convertimos a String para separar los dígitos
        int[] digitos = new int[numeroStr.length()];
        for (int i = 0; i < numeroStr.length(); i++) {
            digitos[i] = Character.getNumericValue(numeroStr.charAt(i));
        }

        // Verificar si es capicúa
        boolean esCapicua = true;
        for (int i = 0, j = digitos.length - 1; i < j; i++, j--) {
            if (digitos[i] != digitos[j]) {
                esCapicua = false;
                break;
            }
        }

        // Resultado
        if (esCapicua) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }
    }
}
