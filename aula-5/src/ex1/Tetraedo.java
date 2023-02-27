package ex1;

public class Tetraedo extends FormaTridimensional{
    private float base;
    private float lado;
    private float alturaBase;

    public Tetraedo(String cor, int x, int y, int z, float base, float lado) {
        super(cor, x, y, z);
        this.base = base;
        this.lado = lado;
    }

    public double obterVolume(float lado) {
        return ((lado * lado * lado) * (Math.sqrt(2)/12));
    }

    public float getBase() {
        return base;
    }

    public float getLado() {
        return lado;
    }

    public float getAlturaBase() {
        return alturaBase;
    }
}
