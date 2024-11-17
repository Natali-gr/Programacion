import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
        nombre del día de la semana.*/

        System.out.println("ingrese un número del 1 al 7 para decirle el dia de la semana:");
        int dia=sc.nextInt();
        String nombre_dia;
        switch (dia){
            case 1:
                nombre_dia="domingo";
                break;
            case 2:
                nombre_dia="lunes";
                break;
            case 3:
                nombre_dia="martes";
                break;
            case 4:
                nombre_dia="miercoles";
                break;
            case 5:
                nombre_dia="jueves";
                break;
            case 6:
                nombre_dia="viernes";
                break;
            case 7:
                nombre_dia="sábado";
                break;
            default:
                nombre_dia=null;
        }
        System.out.println(nombre_dia);
    }
}
