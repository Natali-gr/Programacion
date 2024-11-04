import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definir los meses del año y el array para las temperaturas
        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int[] temperaturas = new int[12];

        // Solicitar las temperaturas medias para cada mes
        System.out.println("Introduce la temperatura media de cada mes del año:");
        for (int i = 0; i < meses.length; i++) {
            System.out.print(meses[i] + ": ");
            temperaturas[i] = sc.nextInt();
        }

        // Mostrar el diagrama de barras
        System.out.println("\nDiagrama de barras de temperaturas:");
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("%-10s: ", meses[i]);
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + temperaturas[i] + "°C)");
        }
    }
}
