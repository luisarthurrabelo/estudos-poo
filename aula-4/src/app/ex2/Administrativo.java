package app.ex2;

public class Administrativo extends Funcionario{
    private int horasExtra = 0;
    private double salarioBase = 0;

    public Administrativo(String nome, int rg, int horasExtra, double salarioBase) {
        super(nome, rg);
        this.horasExtra = horasExtra;
        this.salarioBase = salarioBase;
    }

    public void horasAcumuladas(int h) {
        this.horasExtra = horasExtra + h;
    }

    public void salarioTotal() {
        double valorHora = salarioBase * 0.01;
        System.out.println("Salário Total: " + salarioBase + (horasExtra * valorHora));
        salarioBase = 6000.00;
    }
}
