package domain.estacion;

import domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado = false;
    private Movil bici = null;

    Anclaje() {};

    boolean isOcupado() {
        return this.ocupado;
    }

    Movil getBici() {
        return this.bici;
    }

    public void anclarBici(Movil bici) {
        this.bici = bici;
        this.ocupado = true;
    }
}
