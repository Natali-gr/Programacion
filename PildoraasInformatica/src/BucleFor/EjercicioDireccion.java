package BucleFor;
import java.util.Scanner;
public class EjercicioDireccion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*se pide al usuario que introduzca su dirección de email. Una vez introducido el email, el programa debe decir si la dirección de email es correcta
        o no teniendo en cuenta los siguientes requisitos:
        Debe tener una @
        No debe tener más de una @
        Debe tener un punto
        La dirección de email debe tener al menos 4 caracteres.
        El programa pedirá introducir indefinidamente la dirección de email si no es correcta o si tienes menos de 4 caracteres.*/

        boolean valido=false;
        do{
        System.out.println("ingrese su email: ");
        String email=sc.nextLine();
        int arroba=0;
        boolean punto=false;

            for(int i=0; i<email.length(); i++) {
                if (email.charAt(i) == '@') {
                    arroba++;
                }
                if (email.charAt(i) == '.') {
                    punto = true;
                }
                if (email.length() >= 4 && arroba == 1 && punto) {
                    valido = true;
                } else {
                    System.out.println("email incorrecto.intentelo de nuevo");
                }
            }
        }while (valido==false);
        System.out.println("email correcto");
    }
}
