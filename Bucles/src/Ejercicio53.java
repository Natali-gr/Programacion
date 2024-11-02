import java.util.Scanner;
public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contadorNumeros = 0;

        // Continuar solicitando números mientras la suma sea menor o igual a 10,000
        while (suma <= 10000) {
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();

            // Sumar el número al total acumulado
            suma += numero;
            contadorNumeros++;
        }

        // Calcular la media de los números introducidos
        double media = (double) suma / contadorNumeros;

        // Mostrar resultados
        System.out.println("Total acumulado: " + suma);
        System.out.println("Cantidad de números introducidos: " + contadorNumeros);
        System.out.println("Media de los números introducidos: " + media);
    }
}
