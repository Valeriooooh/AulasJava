package Ficheiros.Atividade2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[] args) {
        File f = new File("teste.txt");
        try {
            FileReader perm = new FileReader(f);
        } catch (IOException e) {
            System.out.println("Ficheiro não existe");
        }
    }
}
