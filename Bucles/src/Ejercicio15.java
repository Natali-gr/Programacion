import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int edadMax=0;
        int edadMin=Integer.MAX_VALUE;

        do{
            System.out.println("Ingrese la edad y terminar con un -1 ");
            edad = sc.nextInt();

            if (edad>=0){
                if (edad>edadMax){
                    edadMax=edad;
                }
                if (edad<edadMin){
                    edadMin=edad;
                }
            }else if(edad!=-1){
                System.out.println("El edad no es valido");
            }
        } while (edad !=-1);
        System.out.println("La edad màxima es "+edadMax);
        System.out.println("La edad mìnima es "+edadMin);

    }

}
