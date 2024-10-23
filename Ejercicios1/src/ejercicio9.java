import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();

        boolean numeroPar= num%2==0? true:false;
        System.out.println("el número es par:" + numeroPar);
    }
}
