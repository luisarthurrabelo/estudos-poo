package ex1;

public class Cubo extends FormaTridimensional{
    private float lado;

    
    public Cubo(String cor, int x, int y, int z, float lado) {
        super(cor, x, y, z);
        this.lado = lado;
    }

    public double obterVolume(float lado) {
        return (lado * lado * lado);
    }

    public float getLado() {
        return lado;
    }
}
