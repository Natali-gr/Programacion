import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Realiza un programa que pida una hora por teclado y que muestre luego
        buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
        tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
        cuenta las horas, los minutos no se deben introducir por teclado.*/

        System.out.print("ingrese una hora: ");
        int hora = sc.nextInt();

        if (hora<=24){
            if (hora>=6 && hora<=12){
                System.out.print("buenos dias");
            } else if (hora>=13 && hora<=20) {
                System.out.print("buenas tardes");
            }else {
                System.out.print("buenas noches");
            }
        }else{
            System.out.print("hora inválida");
        }
    }
}
