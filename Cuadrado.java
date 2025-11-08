public class Cuadrado extends Rectangulo{
    public Cuadrado(double lado){
        super(lado, lado);
    }

    public double getLado() { return getAncho(); }
}
