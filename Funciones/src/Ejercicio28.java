public class Ejercicio28 {
    /*Escribir una función que reciba como parámetro un array de enteros que
    representarán notas de 0 a 10. La función debe devolver un array de String con notas en
    el siguiente formato: insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y
    sobresaliente (9 y 10).*/
    public static String[] clasificarNotas(int[] notas) {
        String[] clasificaciones = new String[notas.length];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] <= 4) {
                clasificaciones[i] = "insuficiente";
            } else if (notas[i] == 5) {
                clasificaciones[i] = "suficiente";
            } else if (notas[i] == 6) {
                clasificaciones[i] = "bien";
            } else if (notas[i] == 7 || notas[i] == 8) {
                clasificaciones[i] = "notable";
            } else if (notas[i] == 9 || notas[i] == 10) {
                clasificaciones[i] = "sobresaliente";
            } else {
                clasificaciones[i] = "nota inválida"; // Para manejar valores fuera de rango
            }
        }

        return clasificaciones;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] notas = {3, 5, 6, 7, 8, 9, 10, 11}; // Incluye una nota fuera de rango para probar
        String[] resultados = clasificarNotas(notas);

        System.out.println("Clasificación de las notas:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
