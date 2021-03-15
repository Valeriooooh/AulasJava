package ClassesEssenciais.AtividadeB;

public class Teste1StrBuilder {
    public static void main(String[] args) {
        String test = "";
        System.gc();

        long start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder(test);
        for (int i = 0; i < 5000; i++) {

        }
    }
}
