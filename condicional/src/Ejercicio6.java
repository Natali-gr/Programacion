import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //pedir tres números
        System.out.println("ingrese 3 números enteros: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        //comprobamos cual es mayor y menor
        if (a>b && a>c && b>c) {
            System.out.println("los números de forma decreciente son: " + a + "," + b + "," + c);
        }else if (a>b && a>c && c>b) {
            System.out.println("los números de forma decreciente son: " + a + "," + c + "," + b);
            }else if (b>a && b>c && a>c) {
                System.out.println("los números de forma decreciente son: " + b + "," + a + "," + c);
                    }else if (b>a && b>c && c>a) {
                        System.out.println("los números de forma decreciente son: " + b + "," + c + "," + a);
                            }else if(c>a && c>b && a>b){
                                System.out.println("los números de forma decreciente son: " + c + "," + a + "," +b);
                                    }else if(c>a && c>b && b>a) {
                                        System.out.println("los números de forma decreciente son: " + c + "," + b + "," + a);
        }
    }
}
