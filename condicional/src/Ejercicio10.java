import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedimos el dia,mes y año fghfhn
        System.out.print("ingrese el día:");
        int dia = sc.nextInt();
        System.out.print("ingrese el mes:");
        int mes = sc.nextInt();
        System.out.print("ingrese el año:");
        int anio = sc.nextInt();

        // Variable que indicará si la fecha es válida
        boolean fechaValida = false;

        // Validar el mes
        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 2: // Febrero tiene 28 días
                    if (dia >= 1 && dia <= 28) {
                        fechaValida = true;
                    }
                    break;
                case 4: case 6: case 9: case 11: // Meses de 30 días
                    if (dia >= 1 && dia <= 30) {
                        fechaValida = true;
                    }
                    break;
                default: // Meses de 31 días
                    if (dia >= 1 && dia <= 31) {
                        fechaValida = true;
                    }
                    break;
            }
        }

        // Mostrar si la fecha es válida o no
        if (fechaValida) {
            System.out.println("La fecha es válida: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        sc.close();

    }
}