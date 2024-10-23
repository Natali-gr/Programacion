import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        dia++;
        if (dia > diasMes[mes - 1]) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }

        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);

    }
}
