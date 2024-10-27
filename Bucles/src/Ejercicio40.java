import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos que ingrese la hora
        System.out.println("ingrese la hora");
        int hora=sc.nextInt();

        if (hora>=0 && hora<=13){
            if (hora >=6 && hora <=12) {
            System.out.println("Buenos dias");
            } else if (hora>=13 && hora<=20) {
                System.out.println("Buenas tardes");
            }else{
                System.out.println("Buenas noches");
            }
        }
    }
}
