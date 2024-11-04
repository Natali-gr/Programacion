import java.util.Random;
public class Ejercicio14 {
    public static void main(String[] args) {
        Random random = new Random();

        // Generar 20 números aleatorios entre 0 y 100
        int[] numeros = new int[20];
        System.out.println("Números generados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101); // Números entre 0 y 100
            System.out.print(numeros[i] + " ");
        }

        // Arrays auxiliares para separar pares e impares
        int[] pares = new int[20];
        int[] impares = new int[20];
        int cuentaPares = 0;
        int cuentaImpares = 0;

        // Clasificar los números como pares o impares
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares[cuentaPares++] = num; // Guardar en pares
            } else {
                impares[cuentaImpares++] = num; // Guardar en impares
            }
        }

        // Reorganizar el array original
        int index = 0;
        for (int i = 0; i < cuentaPares; i++) {
            numeros[index++] = pares[i];
        }
        for (int i = 0; i < cuentaImpares; i++) {
            numeros[index++] = impares[i];
        }

        // Mostrar el resultado
        System.out.println("\n\nArray reorganizado (pares primero, impares después):");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
