public class Rectangulo extends Figura{
    private double ancho;
    private double alto;
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
    }

    public double getAncho() { return ancho; }
    public double getAlto() { return alto; }

    @Override
    public double area(){
        return ancho * alto;
    }
}
