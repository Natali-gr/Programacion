import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definir variables
        int edad;
        int edadMax=0;
        int edadMin=Integer.MAX_VALUE;


        do{
            //pedimos que se introduzca la edad
            System.out.println("Ingrese la edad y terminar con un -1 ");
            edad = sc.nextInt();

            //se pone la condición para la edad máxima y mínima
            if (edad>=0){
                if (edad>edadMax){
                    edadMax=edad;
                }
                if (edad<edadMin){
                    edadMin=edad;
                }
                //se condiciona si es una edad inválida
            }else if(edad!=-1){
                System.out.println("El edad no es valido");

            }//se repite hasta q se introduzca -1
        } while (edad !=-1);
        //se muestra el resultado
        System.out.println("La edad màxima es "+edadMax);
        System.out.println("La edad mìnima es "+edadMin);

    }

}
