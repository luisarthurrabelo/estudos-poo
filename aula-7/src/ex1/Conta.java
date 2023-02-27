package ex1;


public class Conta {
    private String nome;
    private float saldo;
    private int numero;

    public Conta(String nome, float saldo, int numero) {
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
    }

    public void sacar(float valor) throws NewException{

        if(valor < 0) {
            throw new NewException("Valor de saque inválido!");
        }
        else if(valor > saldo) {
            throw new NewException("Saldo insuficiente!");
        }
        else { 
            saldo -= valor;
            System.out.println("O valor de " + valor + " foi sacado, seu saldo é de " + saldo + ".");
        }

    }
    
    public void depositar(float valor) throws NewException{

        if(valor < 0) {
            throw new NewException("Valor de depósito inválido!");
        }
        else {
            this.saldo = saldo + valor;
            System.out.println("O valor de " + valor + " foi depositado, seu saldo é de " + saldo + ".");
        }
    }
    
    public float visualizarSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return "nome: " + nome + ", saldo: " + saldo  + ", número: " + numero;
    }
}

