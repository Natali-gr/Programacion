import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        //solicitar la base imponible
        System.out.println("ingresa la base imponible");
        double baseimponible= sc.nextDouble();

        //solicitar el porcentaje del iva
        System.out.println("ingresa el porcentaje del IVA");
        double porcentajeIva=sc.nextDouble();

        //calcular el importe del iva
        double importeIva= baseimponible*(porcentajeIva/100);

        //calcular el total
        double total=baseimponible + importeIva;

        //mostrar resultados
        System.out.println("importe del iva: "+importeIva);
        System.out.println("Total con iva: "+total);

        sc.close();
    }
}
