package app.ex2;

public class Vendedor extends Funcionario{
    private double vendas = 0, salarioBase = 0;

    public Vendedor(String nome, int rg, double vendas, double salarioBase) {
        super(nome, rg);
        this.vendas = vendas;
        this.salarioBase = salarioBase;
    }

    public void totalVendas(int v) {
        this.vendas = vendas + v;
    }

    public void salarioTotal() {
        salarioBase += vendas * 0.05;
        System.out.println("Salário Total: " + salarioBase);
        salarioBase = 4000.00;
    }
}
