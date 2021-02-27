package Ficheiros.Exemplo1;

import java.io.File;

public class Renomear {
    public static void main(String[] args) {
        File pasta = new File("/home/datom/Projects/Java/AtividadesAulas/src/Ficheiros/Exemplo1/Teste");
        pasta.mkdir();

        File novapasta = new File("/home/datom/Projects/Java/AtividadesAulas/src/Ficheiros/Exemplo1/Teste2");
        novapasta.renameTo(novapasta);
    }
}
