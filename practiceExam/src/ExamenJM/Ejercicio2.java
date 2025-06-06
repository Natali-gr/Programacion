package ExamenJM;
import java.util.Scanner;



public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //desarrolla un programa para una tienda de comida típica peruana

       int precioSopaSeca=12,precioArrozConPato=20;
       int precioSecoCabrito=25;
       int contadorSopa=0;
       int contadorArroz=0;
       int contadorSeco=0;

       System.out.println("ingrese la cantidad de platos vendidos por cada uno de los días de la semana: ");
       System.out.println("los platos son:");
        System.out.println("1. sopa seca");
        System.out.println("2. Arroz con pato");
        System.out.println("3. Seco de cabrito");


        String dias;
       for (int dia=1; dia<=7; dia++) {
           switch (dia){
               case 1:  dias="lunes";
                break;
               case 2: dias="martes";
                break;
               case 3: dias="miercoles";
               break;
               case 4: dias="jueves";
               break;
               case 5: dias="viernes";
               break;
               case 6: dias="sabado";
               break;
               default: dias="domingo";
           }

           System.out.println("ingrese la cantidad de platos vendidos para el "+dias+" :");

           for (int plato = 1; plato <= 3; plato++) {
               if (plato == 1) {
                   System.out.print("sopa seca: ");
                   int sopaSeca = sc.nextInt();
                   contadorSopa += sopaSeca;
               } else if (plato == 2) {
                   System.out.print("arroz con pato: ");
                   int arrozConPato = sc.nextInt();
                   contadorArroz= contadorArroz + arrozConPato;
               } else {
                   System.out.print("seco de cabrito: ");
                   int secoCabrito = sc.nextInt();
                   contadorSeco= contadorSeco + secoCabrito;
               }
           }
       }

        int totalSopaSeca = contadorSopa * precioSopaSeca;
        int totalArrozConPato = contadorArroz * precioArrozConPato;
        int totalSecoCabrito = contadorSeco * precioSecoCabrito;
        System.out.println("el total ganado de sopaSeca es: "+totalSopaSeca);
        System.out.println("el total ganado de arroz con pato es: "+totalArrozConPato);
        System.out.println("el total ganado de seco de cabrito es: "+totalSecoCabrito);


        System.out.println("la cantidad de sopa seca es: "+contadorSopa);
        System.out.println("la cantidad de arroz con pato es: "+contadorArroz);
        System.out.println("la cantidad de seco de cabrito es: "+contadorSeco);


        int totalPlatos=contadorArroz + contadorSeco + contadorSopa;
        System.out.println("el total de platos es: "+totalPlatos);

        int total = totalArrozConPato + totalSopaSeca + totalSecoCabrito;
        System.out.println("el total general de ventas es: "+total);

        if (contadorSopa > 30) {
            int descuento = (int) (totalSopaSeca * 0.10);
            System.out.println("el descuento aplicado es de "+descuento+" %");
       }
    }
}
