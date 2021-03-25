package AtividadeD;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Teste1LerTxt {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(new File("pessoas.txt"));
        } catch (Exception e) {
            System.out.println("Error ");
        }
    }
}
