public abstract class Transporte {
    protected final String marca;
    protected final String modelo;
    protected final int velocidadActual;

    public Transporte(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    // Solo getters (LEER valores)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    // Métodos que devuelven NUEVOS transportes (no modifican el actual)
    public abstract Transporte acelerar(int incremento);
    public abstract Transporte frenar(int decremento);
    public abstract int getVelocidadMaxima();

    @Override
    public String toString() {
        return String.format("%s[%s %s, Velocidad: %d km/h]",
                getClass().getSimpleName(), marca, modelo, velocidadActual);
    }
}
