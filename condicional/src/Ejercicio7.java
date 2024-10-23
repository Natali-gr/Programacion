import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //pedir que ingrese un número
        System.out.println("ingrese un número");
        int num=sc.nextInt();

        //combrobar cuántas cifras tienen
        if (num >= 0 && num <= 9){
            System.out.println("el número tiene una cifra");
        }else if(num >= 10 && num <= 99){
            System.out.println("el número tiene dos cifras");
            }else if(num >= 100 && num <= 999){
                System.out.println("el número tiene tres cifras");
                }else if(num >= 1000 && num <= 9999){
                    System.out.println("el número tiene cuatro cifras");
                    }else if(num >= 10000 && num <= 99999) {
                        System.out.println("el número tiene cinco cifras");
        }
    }
}
