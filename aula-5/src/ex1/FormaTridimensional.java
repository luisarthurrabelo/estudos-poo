package ex1;

public class FormaTridimensional extends Forma{
    private int x, y, z;
    private double volume;

    public FormaTridimensional(String cor, int x, int y, int z){
        super(cor);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double obterVolume() {
        return volume;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
