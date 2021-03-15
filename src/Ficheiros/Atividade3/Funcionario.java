package Ficheiros.Atividade3;

public class Funcionario {
    private String Nome;
    private float salarioBase;

    public Funcionario(String Nome, float salarioBase) {
        this.Nome = Nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float salarioFinal() {
        return (float) (1.05 - 0.07) * getSalarioBase();
    }
}
