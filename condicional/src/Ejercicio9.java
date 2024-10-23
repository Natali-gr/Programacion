import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //solicitar un número
        System.out.println("ingrese un número entre 1 y 7: ");
        int dia=sc.nextInt();

        //comprobamos que día corresponde
        switch (dia){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:

        }

    }
}
