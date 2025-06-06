package Ejercicios2;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
        // La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.

        System.out.print("ingrese una cantidad de segundos: ");
        int segundoTotal=sc.nextInt();

        int hora=3600, minuto=60, segundo=0, contHora=0, contMinuto=0, segundosRestantes=0;

        if (segundoTotal > minuto){
            while (segundoTotal>hora) {
                segundoTotal= segundoTotal - hora;
                contHora++;
                segundosRestantes=segundoTotal;
            }
            while (segundosRestantes>minuto){
                segundosRestantes= segundosRestantes-minuto;
                contMinuto++;
                segundo=segundosRestantes;
            }
        }else{
            segundo=segundoTotal;
        }
        System.out.println("tiene "+contHora+" horas; "+contMinuto+" minutos y "+segundo+" segundos");
    }
}
