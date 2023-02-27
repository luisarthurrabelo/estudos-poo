package app.ex2;

public class Circulo {

    private String nome;
    private Ponto centro;
    private double raio;

    public void criarCirculo(Ponto p, double r) {
        centro = p;
        raio = r;
    }

    public double calcularDiametro(double r) {
        return r * 2;
    }

    public double calcularArea(double r) {
        return 3.14 * (r * r);
    }

    public double calcularPerimetro(double r) {
        return 3.14 * 2 * r;
    }

    public String getNome() {
        return nome;
    }

    public int setNome(String n) {
        if(n != null){
            nome = n;
            return 1;
        }
        else
            return 0;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }
}
