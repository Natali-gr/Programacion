public class Ejercicio26 {
    /*Crear una función que calcule la media aritmética de dos notas enteras. La función
    recibirá como parámetros los dos enteros correspondientes a las notas y devolverá un
    valor decimal con la media de las notas.*/
    public static double calcularMedia(int nota1, int nota2) {
        return (nota1 + nota2) / 2.0;
    }
    public static void main(String[] args) {
        int nota1 = 85;
        int nota2 = 90;

        double media = calcularMedia(nota1, nota2);
        System.out.println("La media aritmética es: " + media);
    }
}
