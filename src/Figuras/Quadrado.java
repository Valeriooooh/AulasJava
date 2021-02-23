package Figuras;

public class Quadrado extends Figura {

    double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return (lado * lado);
    }

    @Override
    public double perimetro() {
        return (lado * 4);
    }

}
