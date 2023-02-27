package ex1;

public class Triangulo extends FormaBidimensional{
    private float base;
    private float altura;

    public Triangulo(String cor, int x, int y, float base, float altura) {
        super(cor, x, y);
        this.base = base;
        this.altura = altura;
    }

    public double obterArea(float base, float altura) {
        return (base * altura)/2;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
}
