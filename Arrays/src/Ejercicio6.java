import java.util.Random;
public class Ejercicio6 {
    public static void main(String[] args) {
        // Crear un array de 10 posiciones con números aleatorios entre 0 y 10
        int[] notas = new int[10];
        Random random = new Random();
        int suma = 0;

        System.out.println("Notas generadas:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(11); // Genera números entre 0 y 10 (inclusive)
            System.out.print(notas[i] + (i < notas.length - 1 ? ", " : ""));
            suma += notas[i];
        }
        // Calcular la media
        double media = suma / 10.0;

        System.out.println("\n\nNota media: " + media);

        // Clasificar según la media
        if (media < 5) {
            System.out.println("Resultado: Has suspendido.");
        } else if (media < 7) {
            System.out.println("Resultado: Tienes un bien.");
        } else if (media < 9) {
            System.out.println("Resultado: Tienes un notable.");
        } else {
            System.out.println("Resultado: Tienes un sobresaliente.");
        }
    }
}
