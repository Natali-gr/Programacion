package practicePOO;

public class CuentaCorrientes {
    private String dni;
    private String nombreTitular;
    private double saldo;

    // Constructor con DNI y nombre del titular (saldo inicial 0)
    public CuentaCorrientes(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    // Constructor con DNI y saldo inicial
    public CuentaCorrientes(String dni, double saldoInicial) {
        this.dni = dni;
        this.nombreTitular = "Desconocido";
        this.saldo = saldoInicial;
    }

    // Constructor con DNI, nombre y saldo inicial
    public CuentaCorrientes(String dni, String nombreTitular, double saldoInicial) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre del Titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
    }
}
