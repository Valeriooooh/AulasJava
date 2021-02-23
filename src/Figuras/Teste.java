package Figuras;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    menu();
    String op = new Scanner(System.in).next();
  }

  static void menu() {
    System.out.println("\t\tCalcular Figuras");
    System.out.println("[1] - Quadrado");
    System.out.println("[2] - Circulo");
    System.out.println("[3] - Triangulo");
    System.out.println("[*] - Sair");
    int op = new Scanner(System.in).nextInt();
    switch (op) {
      case 1:
        quad();
        break;
      case 2:
        cir();
        break;
      case 3:
        tri();
        break;
      default:
        System.exit(0);
    }
  }

  static void quad() {
    System.out.println("Insira o valor do lado: ");
    double n = new Scanner(System.in).nextDouble();
    Quadrado fig = new Quadrado();
    fig.setLado(n);
    System.out.println("Area:" + fig.area());
    System.out.println("Perimetro:" + fig.perimetro());
  }

  static void tri() {
    System.out.println("Insira o valor do lado: ");
    double n1 = new Scanner(System.in).nextDouble();
    double n2 = new Scanner(System.in).nextDouble();
    double n3 = new Scanner(System.in).nextDouble();
    Triangulo fig = new Triangulo();
    fig.setLado(n1, n2, n3);
    System.out.println("Area:" + fig.area());
    System.out.println("Perimetro:" + fig.perimetro());
  }

  static void cir() {
    System.out.println("Insira o valor do raio: ");
    double n = new Scanner(System.in).nextDouble();
    Circulo fig = new Circulo();
    fig.setRaio(n);
    System.out.println("Area:" + fig.area());
    System.out.println("Perimetro:" + fig.perimetro());
  }
}
