import java.util.Scanner;
import java.util.Random;
public class Ejercicio3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }
            System.out.print("Posiciones impares: ");
        for (int i = 1; i < num.length; i += 2) {
            System.out.print(num[i] + (i + 2 < num.length ? ":" : ""));
        }
        System.out.println();
        System.out.print("Posiciones pares: ");
        for (int i = 0; i < num.length; i += 2) {
            System.out.print(num[i] + (i + 2 < num.length ? ":" : ""));
        }
        System.out.println();
    }
}
