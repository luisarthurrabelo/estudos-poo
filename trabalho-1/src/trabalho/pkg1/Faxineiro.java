/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkg1;

public class Faxineiro extends Funcionario{
    
    public Faxineiro(String nome, int cpf, int rg, int numCarteira, double salarioBase) {
        super(nome, cpf, rg, numCarteira, salarioBase);
    }
    
    public void showFaxineiro() {
        System.out.println("Nome: " + super.getNome() + " | CPF: " + super.getCpf() + " | RG: " + super.getRg() + " | Número Carteira: " + 
                            super.getNumCarteira() + " | Salario Base: " + super.getSalarioBase());
    }
    
    public double salarioTotal() {
        return (super.getSalarioBase());
    }
}
