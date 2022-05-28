package domain.estacion;

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

    @Override
    public String toString() {
        return String.format("id: %d \ndireccion: %s \nanclajes: %s",
                getId(), getDireccion(), numAnclajes());
    }

}
