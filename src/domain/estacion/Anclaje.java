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
}
