package practicePOO;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    // Getters y setters con validación
    public int getHora() { return hora; }
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) this.hora = hora;
    }

    public int getMinuto() { return minuto; }
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) this.minuto = minuto;
    }

    public int getSegundo() { return segundo; }
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) this.segundo = segundo;
    }

    // Método para avanzar un segundo
    public void avanzarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) hora = 0;
            }
        }
    }

    // Método para mostrar la hora
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
    }
}
