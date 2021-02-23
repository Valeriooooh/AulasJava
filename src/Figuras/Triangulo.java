package Figuras;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public void setLado(double lado1, double lado2, double lado3) {
        if (possivel(lado1, lado2, lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else
            System.out.println("Triangulo Impossível");
    }

    @Override
    double area() {
        return ((lado1 * lado2) / 2);
    }

    @Override
    double perimetro() {
        return (lado1 + lado2 + lado3);
    }

    boolean possivel(double lado1, double lado2, double lado3) {
        if (lado1 > lado2 + lado3) {
            return false;
        } else if (lado2 > lado1 + lado3) {
            return false;
        } else return !(lado3 > lado1 + lado2);
    }

}
