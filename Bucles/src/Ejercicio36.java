import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Números perfectos entre 1 y 10000:");

        // se ejcuta sobre el rango de 1 a 10000
        for (int num = 1; num <= 10000; num++) {
            int sumaDivisores = 0;

            // se encuentra los divisores del número (excluyendo el propio número)
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sumaDivisores += i;
                }
            }

            // se verifica si la suma de los divisores es igual al número
            if (sumaDivisores == num) {
                System.out.println(num);
            }
        }
    }
}
