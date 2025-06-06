import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        /*Escribe un programa que nos diga el horóscopo a partir del día y el mes de
        nacimiento.*/

        System.out.print("ingrese el dia de nacimiento: ");
        int diaNac=sc.nextInt();
        System.out.print("ingrese el mes de nacimiento: ");
        int mesNac=sc.nextInt();

        if(diaNac <=31){
            String horoscopo;
            switch (mesNac) {
                case 1:
                    if (diaNac <= 19) {
                        System.out.print("capricornio");
                    } else {
                        System.out.print("acuario");
                    }
                    break;
                case 2:
                    if (diaNac <= 18) {
                        System.out.print("acuario");
                    } else if(diaNac>=19 && diaNac<=28){
                        System.out.print("piscis");
                    }
                    break;
                case 3:
                    if (diaNac <=20) {
                        System.out.print("piscis");
                    } else {
                        System.out.print("aries");
                    }
                    break;
                case 4:
                    if (diaNac <=19) {
                        System.out.print("aries");
                    } else {
                        System.out.print("tauro");
                    }
                    break;
                case 5:
                    if (diaNac <=20) {
                        System.out.print("tauro");
                    } else {
                        System.out.print("geminis");
                    }
                    break;
                case 6:
                    if (diaNac <=20) {
                        System.out.print("geminis");
                    } else {
                        System.out.print("cancer");
                    }
                    break;
                case 7:
                    if (diaNac <=22) {
                        System.out.print("cancer");
                    } else {
                        System.out.print("leo");
                    }
                    break;
                case 8:
                    if (diaNac <=22) {
                        System.out.print("leo");
                    } else {
                        System.out.print("virgo");
                    }
                    break;
                case 9:
                    if (diaNac <=22) {
                        System.out.print("virgo");
                    } else {
                        System.out.print("libra");
                    }
                    break;
                case 10:
                    if (diaNac <=22) {
                        System.out.print("libra");
                    } else {
                        System.out.print("escorpio");
                    }
                    break;
                case 11:
                    if (diaNac <=21) {
                        System.out.print("escorpio");
                    } else {
                        System.out.print("sagitario");
                    }
                    break;
                case 12:
                    if (diaNac <=21) {
                        System.out.print("sagitario");
                    } else {
                        System.out.print("capricornio");
                    }
                    break;
                default:
                    System.out.print("fecha inválida");
            }
        }
    }
}
