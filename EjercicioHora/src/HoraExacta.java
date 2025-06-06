public class HoraExacta extends Hora{
    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    public boolean setSegundo(int valor) {
        if (valor >= 0 && valor < 60) {
            segundos = valor;
            return true;
        }
        return false;
    }

    @Override
    public void inc() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            super.inc();
        }
    }

    public boolean esIgual(HoraExacta otra) {
        return this.hora == otra.hora && this.minutos == otra.minutos && this.segundos == otra.segundos;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}
