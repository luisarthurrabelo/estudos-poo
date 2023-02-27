/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkg1;

public class Comissionado extends Funcionario{
    private double valorVendido = 0, comissao = 0;
    
    public Comissionado(String nome, int cpf, int rg, int numCarteira, double salarioBase, double valorVendido, double comissao) {
        super(nome, cpf, rg, numCarteira, salarioBase);
        this.valorVendido = valorVendido;
        this.comissao = comissao;
    }
    
    public double getValorVendido() {
        return valorVendido;
    }
    
    public double getComissao() {
        return comissao;
    }
    
    public void showComissionado() {
        System.out.println("Nome: " + super.getNome() + " | CPF: " + super.getCpf() + " | RG: " + super.getRg() + " | Número Carteira: " + 
                            super.getNumCarteira() + " | Salario Base: " + super.getSalarioBase() + " | Valor Vendido: " + getValorVendido() + " | Comissão: " + getComissao());
    }
    
    public double salarioTotal() {
        return (super.getSalarioBase() + (valorVendido * comissao));
    }
}
