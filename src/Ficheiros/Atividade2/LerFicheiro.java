package Ficheiros.Atividade2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LerFicheiro {
    public static void main(String[] args) {
        File f = new File("Teste.txt");

        try {
            f.createNewFile();

            FileWriter perm = new FileWriter(f, true);

            BufferedWriter writer = new BufferedWriter(perm);

            String mensagem = "mensagem de  multiplas  linhas \n teste";

            writer.write(mensagem);

            writer.close();
        } catch (IOException e) {
            System.out.println("Erro Ficheiro não pôde ser criado");
        }
    }
}
