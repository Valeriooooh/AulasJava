package AtividadeC;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Teste3 {
    public static void explode() {
        System.out.println(1 / 0);
        // int[] a = {2, 22}; System.out.println(a[-1]);
        // int[] a = {2, 22}; System.out.println(a[4]=333);
        // Vector v = new Vector(); v.add(0,v.get(0));
        // Pessoa p = new Pessoa(); p.toString();
        // throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            explode();
            File f = new File("fich.ext");
            FileReader fr = new FileReader(f);
        } catch (ArithmeticException e) {
            System.out.println("1. Aritmetica " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("5. Pointer nulo: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("2. Indice fora de limites " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("3. Runtime " + e.getMessage());
        } catch (IOException e) {
            System.out.println("4. Ficheiro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("6. Exceção: " + e.getMessage());
        } finally {
            System.out.println("Fim com sucesso.");
        }
    }
}
