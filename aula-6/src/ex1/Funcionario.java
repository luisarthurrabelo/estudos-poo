package ex1;

public abstract class Funcionario {
    
    private String nome, matricula;
    private double salario_base;
    
    public Funcionario(String nome, String matricula, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }
    
    public double getSalario_base() {
        return salario_base;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public abstract double calculaSalario();

}
