package AtividadeB;

import java.io.FileInputStream;
import java.io.IOException;

public class LerFicheiro {
    public static void main(String[] args) {
        try {
            FileInputStream ficheiro = new FileInputStream("Inteiro.txt");
            int conteudo;
            while ((conteudo = ficheiro.read()) != -1) {
                System.out.print((char) conteudo);
            }
            ficheiro.close();
        } catch (IOException e) {
            System.out.println("Error ");
        }
    }
}
