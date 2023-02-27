package ex1;

public class Quadrado extends FormaBidimensional{
    private float lado;

    public Quadrado(String cor, int x, int y, float lado) {
        super(cor, x, y);
        this.lado = lado;
    }

    public double obterArea(float lado) {
        return (lado * lado);
    }

    public float getLado() {
        return lado;
    }
}
