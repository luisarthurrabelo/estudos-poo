package ex2;

public class FuncionarioComissionado extends Funcionario {

    private int numVendas;
    private double comissao;

    public FuncionarioComissionado(int matricula, String nome, int id, double salarioBase, String cpf, int numVendas, double comissao) {
        super(matricula, nome, id, salarioBase, cpf);
        this.numVendas = numVendas;
        this.comissao = comissao;
    }

    public double getSalarioMensal() {
        return getSalarioBase() + comissao;
    }

    public void atualizaVendas(int vendas) {
        this.numVendas = numVendas + vendas;
    }

    public String toString() {
        return "Matricula: " + getMatricula() + ", Nome: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf();
    }
}