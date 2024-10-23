import java.util.Scanner;

public class Ejercicio24 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);

        //solicitamos ingrese el numero en MB
        System.out.println("ingrese la cantidad en MB");
        double megabytes= sc.nextDouble();

        //convertimos de MB a KB
        double kilobytes=megabytes*1024;
        System.out .println("la cantidad en KB es: "+kilobytes);
    }
}
