package practicePOO;

public class MainCuentaCorriente {
    public static void main(String[] args) {
        // Crear una cuenta con DNI y nombre del titular
        CuentaCorrientes cuenta1 = new CuentaCorrientes("12345678A", "Juan Pérez");

        // Mostrar información inicial
        cuenta1.mostrarInformacion();

        // Ingresar dinero
        cuenta1.ingresarDinero(1000);
        cuenta1.mostrarInformacion();

        // Sacar dinero
        boolean exito = cuenta1.sacarDinero(500);
        System.out.println("¿Operación exitosa? " + exito);
        cuenta1.mostrarInformacion();

        // Intentar sacar más dinero del saldo disponible
        exito = cuenta1.sacarDinero(600);
        System.out.println("¿Operación exitosa? " + exito);
        cuenta1.mostrarInformacion();
    }
}
