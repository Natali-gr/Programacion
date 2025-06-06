package Ejercicios3;
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y segundos y nos calcula la hora,
        // minutos y segundos que serán, transcurrido un segundo.

        int segundoDespues=0, minutoDespues=0, horaDespues=0;
        int horaMaxima=24, minutoMaximo=59, segundoMaximo=59;

        System.out.print("Ingrese la hora: ");
        int hora=sc.nextInt();

        if (hora < horaMaxima){
            System.out.print("Ingrese los minutos: ");
            int min=sc.nextInt();
            System.out.print("Ingrese los segundos: ");
            int seg=sc.nextInt();

            if (seg < segundoMaximo){
                segundoDespues= seg + 1;
                minutoDespues=min;
                horaDespues=hora;
            }else {
                if (seg == segundoMaximo && min < minutoMaximo) {
                    minutoDespues = min + 1;
                    segundoDespues = 0;
                    horaDespues = hora;
                } else {
                    if (seg == segundoMaximo && min == minutoMaximo) {
                        horaDespues = hora + 1;
                        minutoDespues = 0;
                        segundoDespues = 0;
                    }
                }
            }
            System.out.print("El tiempo transcurrido un segundo después es: "+horaDespues+" horas,"+minutoDespues+" minutos,"+segundoDespues+" segundos");
        }else{
            System.out.print("La hora máxima es 24");
        }
    }
}
