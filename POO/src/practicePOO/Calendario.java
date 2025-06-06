package practicePOO;

public class Calendario {
    private int dia;
    private int mes;
    private int año;

    public Calendario(int año, int mes, int dia) {
        if (esFechaValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Fecha no válida");
        }
    }

    private boolean esFechaValida(int año, int mes, int dia) {
        if (mes < 1 || mes > 12 || dia < 1) return false;
        int diasEnMes = diasDelMes(año, mes);
        return dia <= diasEnMes;
    }

    private int diasDelMes(int año, int mes) {
        switch (mes) {
            case 4, 6, 9, 11 -> { return 30; }
            case 2 -> {
                if (esBisiesto(año)) return 29;
                return 28;
            }
            default -> { return 31; }
        }
    }

    private boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public void incrementarDia() {
        dia++;
        if (dia > diasDelMes(año, mes)) {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            incrementarAño(1);
        }
    }

    public void incrementarAño(int cantidad) {
        año += cantidad;
    }

    public void mostrar() {
        System.out.printf("Fecha: %04d-%02d-%02d%n", año, mes, dia);
    }

    public boolean iguales(Calendario otraFecha) {
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }
}
