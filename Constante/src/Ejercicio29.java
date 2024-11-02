import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa la hora: ");
        int hora=sc.nextInt();
        System.out.println("ingresa los minutos: ");
        int minuto=sc.nextInt();
        System.out.println("ingresa los segundos: ");
        int segundos=sc.nextInt();

        if(hora>0 && hora<=23 && minuto<=59 && segundos<=59) {
            segundos = (segundos + 1) % 60;
            minuto = (segundos == 0) ? (minuto + 1) % 60 : minuto;
            hora = (segundos == 0 && minuto == 0) ? (hora + 1) % 24 : hora;

            System.out.println("la hora después de un segundo será: horas=" + hora + "; minutos=" + minuto + "; segundos= " + segundos);
        }
    }
}
