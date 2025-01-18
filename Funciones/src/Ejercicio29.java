public class Ejercicio29 {
    /*Diseña una función que reciba como parámetros 3 enteros (día, mes, año) y devuelva
    un array de 3 enteros (día, mes, año) correspondientes al día siguiente.*/
    public static int[] calcularDiaSiguiente(int dia, int mes, int anio) {
        // Días en cada mes
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verificar si es un año bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            diasPorMes[1] = 29; // Febrero tiene 29 días en años bisiestos
        }

        // Incrementar el día
        dia++;

        // Verificar si se pasa del último día del mes
        if (dia > diasPorMes[mes - 1]) {
            dia = 1; // Reiniciar día al primero
            mes++;   // Incrementar el mes

            // Verificar si se pasa del último mes del año
            if (mes > 12) {
                mes = 1;  // Reiniciar mes a enero
                anio++;   // Incrementar el año
            }
        }

        return new int[]{dia, mes, anio};
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int dia = 28;
        int mes = 2;
        int anio = 2024; // Año bisiesto

        int[] diaSiguiente = calcularDiaSiguiente(dia, mes, anio);

        System.out.println("El día siguiente es: " + diaSiguiente[0] + "/" + diaSiguiente[1] + "/" + diaSiguiente[2]);
    }
}
