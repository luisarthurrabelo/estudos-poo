package app.ex1;

public class CD extends Locadora{
    private String cantor;
    private int numFaixas;

    public CD(String nome, String tipo, String genero, int anoProd, int numCopias, double preco,
                String cantor, int numFaixas) {

        super(nome, tipo, genero, anoProd, numCopias, preco);
        this.cantor = cantor;
        this.numFaixas = numFaixas;
    }

    public void showCD() {
        System.out.println(super.getNome() + " | " + super.getTipo() + " | " + super.getGenero() + " | " + super.getAnoProd() + " | " + super.getNumCopias() + " | " + super.getPreco() + " | " + 
                            cantor + " | " + numFaixas);
    }
}
