package ex2;

public class FuncionarioNoturno extends Funcionario{
    
    private int noitesTrab;
    private double valorNoite;

    public FuncionarioNoturno(int matricula, String nome, int id, double salarioBase, String cpf, int noitesTrab, double valorNoite) {
        super(matricula, nome, id, salarioBase, cpf);
        this.noitesTrab = noitesTrab;
        this.valorNoite = valorNoite;
    }

    public double getSalarioMensal(double salarioBase) {
        return salarioBase + (valorNoite * noitesTrab);
    }

    public void atualizaNoites(int noites) {
        this.noitesTrab = noitesTrab + noites;
    }

    public String toString() {
        return "Matricula: " + getMatricula() + ", Nome: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf();
    }
}
