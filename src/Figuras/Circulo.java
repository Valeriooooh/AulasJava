package Figuras;

public class Circulo extends Figura {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    double area() {
        return Math.PI * (raio * raio);
    }

    @Override
    double perimetro() {
        return (2 * Math.PI * raio);
    }
}
