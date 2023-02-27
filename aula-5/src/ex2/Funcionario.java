package ex2;

public class Funcionario {

    private int matricula;
    private String nome;
    private int idade;
    private double salarioBase;
    private String cpf;

    public Funcionario(int matricula, String nome, int id, double salarioBase, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = id;
        this.salarioBase = salarioBase;
        this.cpf = cpf;
    }

    public double getSalarioMensal() {
        return salarioBase;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }
}
