public class Ejercicio20 {
    /*Definir una función que tome como parámetros dos arrays,
    el primero con los 6 números de una apuesta de la primitiva, y el segundo (ordenado) con los 6 números de la combinación ganadora.
    La función devolverá el número de aciertos.*/
    public static int contarAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;

        // Comprobar cuántos números de la apuesta están en la combinación ganadora
        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++; // Se ha encontrado un acierto
                    break; // No hace falta seguir buscando para este número de la apuesta
                }
            }
        }

        return aciertos;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] apuesta = {1, 5, 8, 13, 20, 30};  // Números de la apuesta
        int[] ganadora = {1, 5, 9, 15, 20, 30}; // Números de la combinación ganadora

        int aciertos = contarAciertos(apuesta, ganadora);

        System.out.println("Número de aciertos: " + aciertos);
    }
}

