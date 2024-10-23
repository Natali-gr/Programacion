import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota del primer trimestre: ");
        int nota1 = sc.nextInt();
        System.out.println("Ingrese la nota del segundo trimestre: ");
        int nota2 = sc.nextInt();
        System.out.println("Ingrese la nota del tercer trimestre: ");
        int nota3 = sc.nextInt();

        int media= (nota1+nota2+nota3)/3;
        double mediaDecimal = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("La media entera es: " + media);
        System.out.println("La media con decimal es: " + mediaDecimal);
    }
}
