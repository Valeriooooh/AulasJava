package DivZero;

public class DivZero {
  public static void main(String[] args) {
    int a = 1, b = 0;

    try {
      // divisão por zero
      System.out.println(a / b);

    } catch (ArithmeticException e) {
      // Apanha a exceção Aritmetica
      System.out.println("Divisão por zero\n");
      e.printStackTrace();
    } catch (RuntimeException e) {
      // Apanha a exceção Runtime
      System.out.println("Runtime exception\n" + e.getMessage());

    }
  }
}
