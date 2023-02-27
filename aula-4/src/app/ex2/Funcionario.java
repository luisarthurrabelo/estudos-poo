package app.ex2;

public class Funcionario {
    private String nome;
    private int rg;

    public Funcionario(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public int rg() {
        return rg;
    }
}
