import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Escribe un programa que dada una hora determinada (horas y minutos),
        calcule los segundos que faltan para llegar a la medianoche.*/

        System.out.print("ingrese la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("ingrese los minutos (0-59): ");
        int minutos = sc.nextInt();

        if (hora > 24) {
            System.out.print("número inválido");
        } else{
            int segundosPasados = (hora * 3600) + (minutos * 60);
            int segundosEnUnDia = 24 * 3600;
            int segundosFaltantes = segundosEnUnDia - segundosPasados;

            System.out.print("faltan " + segundosFaltantes + " segundos para la medianoche");
        }
    }
}
