import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       /* Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
        nombre del día de la semana.*/

        System.out.print("ingrese un número (1 al 7): ");
        int numero= sc.nextInt();

        switch (numero){
            case 1:
                System.out.print("domingo");
                break;
            case 2:
                System.out.print("lunes");
                break;
            case 3:
                System.out.print("martes");
                break;
            case 4:
                System.out.print("miercoles");
                break;
            case 5:
                System.out.print("jueves");
                break;
            case 6:
                System.out.print("viernes");
                break;
            case 7:
                System.out.print("sábado");
                break;
            default:
                System.out.print("número inválido");
        }
    }
}
