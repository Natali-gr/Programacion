
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //Escribe un programa que pida por teclado un día de la semana y que diga qué
        //asignatura toca a primera hora ese día.

    System.out.println("ingrese un dia de la semana:");
    String dia = sc.nextLine();
    String asignatura;
    switch(dia){
        case "lunes":
            asignatura="matematicas";
            break;
        case "martes":
            asignatura="biologia";
            break;
        case "miercoles":
            asignatura="geografia";
            break;
        case "jueves":
            asignatura="quimica";
            break;
        case "viernes":
            asignatura="literatura";
            break;
        default:
            asignatura=null;
            break;
        }
        System.out.println(asignatura);
    }
}