import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //pedir que ingrese una nota
        System.out.println("ingrese una nota entera de 0 a 10: ");
        int nota=sc.nextInt();

        //comprobamos la condición
        if (nota >=0 && nota <=4){
            System.out.println("insuficiente");
        }else if (nota == 5) {
            System.out.println("suficiente");
                } else if (nota == 6) {
                     System.out.println("bien");
                    } else if (nota==7 || nota==8) {
                        System.out.println("notable");
                         } else if (nota==9 || nota==10) {
                            System.out.println("sobresaliente");
        }
    }
}
