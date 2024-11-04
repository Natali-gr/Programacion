import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int[] userArrayForAverage = new int[10];
        int sum = 0;

        System.out.println("Introduce otros 10 números:");
        for (int i = 0; i < userArrayForAverage.length; i++) {
            userArrayForAverage[i] = sc.nextInt();
            sum += userArrayForAverage[i];
        }
        double average = sum / 10.0;
        int aboveAverage = 0, belowAverage = 0, equalToAverage = 0;

        for (int num : userArrayForAverage) {
            if (num > average) {
                aboveAverage++;
            } else if (num < average) {
                belowAverage++;
            } else {
                equalToAverage++;
            }
        }
        System.out.println("Media: " + average);
        System.out.println("Mayores que la media: " + aboveAverage);
        System.out.println("Menores que la media: " + belowAverage);
        System.out.println("Iguales a la media: " + equalToAverage);

        sc.close();
    }
}
