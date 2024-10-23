import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //solicitamos 2 números distintos
        System.out.println("ingrese dos números distintos");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //comprobamos cual es mayor o si son iguales
        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else {
            if (b > a) {
                System.out.println(b + " es mayor que " + a);
            } else {
                System.out.println("son iguales");
            }
        }
    }
}
