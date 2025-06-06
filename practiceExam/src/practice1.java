import java.util.Scanner;

public class practice1 {

    public static int sumar(int a,int b){
        int suma=a+b;
        return suma;
    }




    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


        System.out.print("ingrese 2 numeros: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int resultado1=sumar(a,b);
        int resultado2=sumar(7,2);

        System.out.print(resultado1+" , "+resultado2);

    }
}
