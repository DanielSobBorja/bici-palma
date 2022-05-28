package domain.estacion;

import java.util.Arrays;
import java.util.Optional;

public class Estacion {

    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    public void consultarEstacion() {
        System.out.println(this);
    }

    public long anclajesLibres() {
        return Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).count();
    }

    public void consultarAnclajes() {
        Arrays.stream(anclajes()).map(a -> Optional.ofNullable(a.getBici()))
                .forEach(bici -> System.out.print("Anclaje " +
                        (((Optional<?>) bici).isPresent()? ((Optional<?>) bici).get(): "libre")
                        + '\n'));
    }

    @Override
    public String toString() {
        return String.format("id: %d \ndireccion: %s \nanclajes: %s",
                getId(), getDireccion(), numAnclajes());
    }


}
