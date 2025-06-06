import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*Escribe un programa que pida por teclado un día de la semana y que diga qué
        asignatura toca a primera hora ese día.*/

        System.out.print("ingrese un dia de semana: ");
        String dia=sc.nextLine();

        switch (dia){
            case "lunes":
                System.out.print("programación");
                break;
            case "martes":
                System.out.print("base de datos");
                break;
            case "miércoles":
                System.out.print("sistemas");
                break;
            case "jueves":
                System.out.print("entornos");
                break;
            case "viernes":
                System.out.print("inglés");
                break;
            default:
                System.out.print("no hay clases");
        }
    }
}
