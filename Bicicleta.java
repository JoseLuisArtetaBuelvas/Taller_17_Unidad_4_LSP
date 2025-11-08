public class Bicicleta extends Transporte {
    private static final int VELOCIDAD_MAXIMA = 40;

    public Bicicleta(String marca, String modelo, int velocidadActual) {
        super(marca, modelo, velocidadActual);
    }

    @Override
    public Bicicleta acelerar(int incremento) {
        int nuevaVelocidad = velocidadActual + incremento;
        if (nuevaVelocidad > VELOCIDAD_MAXIMA) {
            nuevaVelocidad = VELOCIDAD_MAXIMA;
        }
        return new Bicicleta(marca, modelo, nuevaVelocidad);
    }

    @Override
    public Bicicleta frenar(int decremento) {
        int nuevaVelocidad = velocidadActual - decremento;
        if (nuevaVelocidad < 0) {
            nuevaVelocidad = 0;
        }
        return new Bicicleta(marca, modelo, nuevaVelocidad);
    }

    @Override
    public int getVelocidadMaxima() {
        return VELOCIDAD_MAXIMA;
    }
}
