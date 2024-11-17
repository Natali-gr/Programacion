import java.util.Scanner;

public class Ejercicio2 {
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    /*Realiza un programa que pida una hora por teclado y que muestre luego
    buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
    tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
    cuenta las horas, los minutos no se deben introducir por teclado.*/

    System.out.println("Ingrese la hora (0-23):");
    int hora=sc.nextInt();

    if (hora <0 || hora > 23) {
        System.out.println("hora incorrecta,ingresa un valor entre 0 y 23: ");
    }else{
        if(hora >=6 && hora <= 12){
            System.out.println("buenos dias");
        }else if(hora >=13 && hora <=20){
            System.out.println("buenas tardes");
        }else {
            System.out.println("buenas noches");
            }
        }
    }
}
