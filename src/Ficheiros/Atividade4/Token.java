package Ficheiros.Atividade4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        int numAluno;
        String nomeAluno;
        float notaAluno;
        try {

            Scanner scnr = new Scanner(
                    new File("/home/datom/Projects/Java/AtividadesAulas/src/Ficheiros/Atividade4/ListaDeAlunos.txt"));
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                // System.out.println(line);
                StringTokenizer st = new StringTokenizer(line);

                numAluno = Integer.valueOf(st.nextToken());
                nomeAluno = st.nextToken();
                notaAluno = Float.valueOf(st.nextToken());

                System.out.println("Nº  : " + numAluno);
                System.out.println("Nome: " + nomeAluno);
                System.out.println("Nota: " + notaAluno);
                System.out.println("\n\n");
            }
            scnr.close();
        } catch (IOException e) {
            System.out.println("Erro de ficheiro");
        }
    }
}
