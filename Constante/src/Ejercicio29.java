import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa la hora: ");
        int hora=sc.nextInt();
        System.out.println("ingresa los minutos: ");
        int minutos=sc.nextInt();
        System.out.println("ingresa los segundos: ");
        int segundos=sc.nextInt();

        segundos++;
        minutos=segundos/60;
        segundos=segundos%60;
        hora=hora%24;

        System.out.println("la hora después de un segundo será: horas="+hora+"; minutos="+minutos+"; segundos= "+segundos);

    }
}
