package trabalho.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Funcionario {
    private String nome = "";
    private int cpf = 0, rg = 0, numCarteira = 0;
    private double salarioBase = 0;
    
    public Funcionario(String nome, int cpf, int rg, int numCarteira, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.numCarteira = numCarteira;
        this.salarioBase = salarioBase;           
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getRg() {
        return rg;
    }

    public int getNumCarteira() {
        return numCarteira;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
