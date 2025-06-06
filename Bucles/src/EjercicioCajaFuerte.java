import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int intento=1;
        int clave=1234;
        do {
            System.out.println("Ingrese la combinaciòn para la caja fuerte:");
            int num = sc.nextInt();

            if (num == clave) {
                System.out.println("El caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("lo siento, esa no es la combinación");
            }
            intento++;
        }while (intento <= 4) ;
    }
}
