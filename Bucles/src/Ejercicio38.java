import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //se pide ingresar una letra
        System.out.println("Ingrese una letra: ");
        //convierte la letra a minúscula
       char letra = sc.next().toUpperCase().charAt(0);

       //se comprueba si es vocal o consonante
        if (letra== 'A'  || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("la letra es vocal");
        }else{
            System.out.println("El letra es consonante");
        }

    }
}
