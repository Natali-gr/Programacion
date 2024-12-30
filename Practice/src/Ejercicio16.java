import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
        hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
        Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
        por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
        a las 15:00h.*/

        final int FIN_DE_SEMANA_HORAS=15;
        final int FIN_DE_SEMANA_MINUTOS=FIN_DE_SEMANA_HORAS *60;
        final int MINUTOS_POR_DIA=24*60;
        System.out.print("Ingrese el dia de la semana: ");
        String dia=sc.nextLine().toLowerCase();

        System.out.print("Ingrese la hora: ");
        int hora=sc.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos= sc.nextInt();

        int minutosDesdeLunes=0;
        if(dia.equals("lunes")){
            minutosDesdeLunes=0;
        } else if (dia.equals("martes")) {
            minutosDesdeLunes=MINUTOS_POR_DIA;
        } else if (dia.equals("miércoles")) {
            minutosDesdeLunes=2* MINUTOS_POR_DIA;
        } else if (dia.equals("jueves")) {
            minutosDesdeLunes=3* MINUTOS_POR_DIA;
        } else if (dia.equals("viernes")) {
            minutosDesdeLunes=4* MINUTOS_POR_DIA;
        }else {
            System.out.print("día inválido");
            return;
        }
        int minutosActuales=minutosDesdeLunes+ hora * 60 + minutos;
        int minutosFinDeSemana=4 * MINUTOS_POR_DIA +FIN_DE_SEMANA_MINUTOS;
        int minutosRestantes= minutosFinDeSemana - minutosActuales;
        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");
    }
}
