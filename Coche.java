public class Coche  extends Transporte{
    private static final int VELOCIDAD_MAXIMA = 200;

    public Coche(String marca, String modelo, int velocidadActual) {
        super(marca, modelo, velocidadActual);
    }

    @Override
    public Coche acelerar(int incremento) {
        int nuevaVelocidad = velocidadActual + incremento;
        if (nuevaVelocidad > VELOCIDAD_MAXIMA) {
            nuevaVelocidad = VELOCIDAD_MAXIMA;
        }
        return new Coche(marca, modelo, nuevaVelocidad);
    }

    @Override
    public Coche frenar(int decremento) {
        int nuevaVelocidad = velocidadActual - decremento;
        if (nuevaVelocidad < 0) {
            nuevaVelocidad = 0;
        }
        return new Coche(marca, modelo, nuevaVelocidad);
    }

    @Override
    public int getVelocidadMaxima() {
        return VELOCIDAD_MAXIMA;
    }
}
