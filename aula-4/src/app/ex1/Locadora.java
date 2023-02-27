package app.ex1;

public class Locadora {
    private String nome, tipo, genero;
    private int anoProd, numCopias;
    private double preco;

    public Locadora(String nome, String tipo, String genero, int anoProd, int numCopias, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.anoProd = anoProd;
        this.numCopias = numCopias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }
    
    public int getAnoProd() {
        return anoProd;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public double getPreco() {
        return preco;
    }
}
