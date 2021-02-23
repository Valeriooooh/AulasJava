package AtividadeC;

public class Teste1 {
    public static void explode() throws Bomba {
        throw new Bomba();

    }

    public static void main(String[] args) {
        try {
            explode();
        } catch (RuntimeException e) {
            System.out.println("Error " + e.getMessage());
        } catch (Bomba e) {
            System.out.println("Bomba ");
        }
    }
}
