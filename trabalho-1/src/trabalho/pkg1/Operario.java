package trabalho.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Operario extends Funcionario{
    private double valorProd = 0;
    
    public Operario(String nome, int cpf, int rg, int numCarteira, double salarioBase, double valorProd) {
        super(nome, cpf, rg, numCarteira, salarioBase);
        this.valorProd = valorProd;
    }
    
    public double getValorProd() {
        return valorProd;
    }
    
    public void showOperario() {
        System.out.println("Nome: " + super.getNome() + " | CPF: " + super.getCpf() + " | RG: " + super.getRg() + " | Número Carteira: " + 
                            super.getNumCarteira() + " | Salario Base: " + super.getSalarioBase() + " | Valor de Produção: " + getValorProd());
    }
    
    public double salarioTotal() {
        return (valorProd + super.getSalarioBase());
    }
}
