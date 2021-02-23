package AtividadeC;

import java.util.GregorianCalendar;

public class PessoaComErro { // CLASSE COM ERRO DELIBERADO

    String nome;
    int idade;
    char genero;
    String morada;
    private GregorianCalendar dataRegisto;

    PessoaComErro() { // construtor QUE PROVOCARÁ EXCEÇÃO
    }

    PessoaComErro(String str) { // construtor
        nome = str;
    }

    PessoaComErro(String str, int i) { // construtor
        nome = str;
        idade = i;
    }

    void setNome(String str) {
        nome = str;
    }

    void setIdade(int i) {
        idade = i;
    }

    void setGenero(char c) {
        genero = c;
    }

    void setMorada(String str) {
        morada = str;
    }

    String getNome() {
        return nome;
    }

    int getIdade() {
        return idade;
    }

    char getGenero() {
        return genero;
    }

    String getMorada() {
        return morada;
    }

    public String toString() {
        return "Nome: " + nome + ". Idade: " + idade + ". Género: " + genero + ". Morada: " + morada + ", Registado em "
                + dataRegisto.get(Calendar.DAY_OF_MONTH) + "/" + (dataRegisto.get(Calendar.MONTH) + 1) + "/"
                + dataRegisto.get(Calendar.YEAR) + "]";
    }

}
