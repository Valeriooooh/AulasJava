package AtividadeC;

public class Teste2 {
    public static void explode() {
        throw new RuntimeException();

    }

    public static void main(String[] args) {
        try {
            explode();
        } catch (RuntimeException e) {
            System.out.println("Exceção: " + e.getMessage());
        } finally {
            System.out.println("Fim com sucesso.");
        }
    }
}
