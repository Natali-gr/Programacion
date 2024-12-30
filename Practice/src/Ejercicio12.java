import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Escribe un programa que diga cuál es la primera cifra de un número entero
        introducido por teclado. Se permiten números de hasta 5 cifras.*/

        System.out.print("ingrese un número");
        int num= sc.nextInt();

        int primeraCifra=0;
        if(num>9 && num <100){
            primeraCifra=num/10;
        } else if (num>99 && num<1000) {
            primeraCifra=num/100;
        } else if (num>999 && num<10000) {
            primeraCifra=num/1000;
        } else if (num>9999 && num<100000) {
            primeraCifra=num/10000;
        }
        System.out.print("la primera cifra del número introducido es: "+primeraCifra);
    }
}
