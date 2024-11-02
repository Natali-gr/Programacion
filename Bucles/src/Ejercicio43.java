import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("Ingrese un numero: ");
             num = sc.nextInt();

            if (num >= 10 && num <= 99) {
                num = num / 10;
                System.out.println("la primera cifra es: " + num);
            } else if (num >= 100 && num <= 999) {
                num = num / 100;
                System.out.println("la primera cifra es: " + num);
            }else if (num >= 1000 && num <= 9999) {
                num = num / 1000;
                System.out.println("la primera cifra es: " + num);
            }else if (num >= 10000 && num <= 99999) {
                num = num / 10000;
                System.out.println("la primera cifra es: " + num);
            }else{
                System.out.println("El numero no es valido");
            }
        }while (num <= 99999) ;
    }
}
