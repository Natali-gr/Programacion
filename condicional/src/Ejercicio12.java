import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes de nacimiento: ");
        int mes = sc.nextInt();

        String signo = obtenerHoroscopo(dia, mes);
        if (signo != null) {
            System.out.println("Tu horóscopo es: " + signo);
        } else {
            System.out.println("Fecha de nacimiento incorrecta.");
        }

        sc.close();
    }

    public static String obtenerHoroscopo(int dia, int mes) {
        if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)) {
            return "Aries";
        } else if ((dia >= 21 && mes == 4) || (dia <= 20 && mes == 5)) {
            return "Tauro";
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            return "Géminis";
        } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
            return "Cáncer";
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            return "Leo";
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            return "Virgo";
        } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
            return "Libra";
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            return "Escorpio";
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            return "Sagitario";
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            return "Capricornio";
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            return "Acuario";
        } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            return "Piscis";
        } else {
            return null;
        }
    }
}
