package Ficheiros.Atividade1;

import java.io.File;

public class Ficheiro {
    public static void main(String[] args) {
        File pasta = new File("/home/datom/Projects/Java/AtividadesAulas/src/Ficheiros/Atividade1/Teste");
        pasta.mkdir();
        File novapasta = new File("/home/datom/Projects/Java/AtividadesAulas/src/Ficheiros/Atividade1/Teste2");
        novapasta.mkdir();
    }
}
