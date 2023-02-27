package ex1;

public class FormaBidimensional extends Forma{
    private int x, y;
    private double area;

    public FormaBidimensional(String cor, int x, int y){
        super(cor);
        this.x = x;
        this.y = y;
    }

    public double obterArea() {
        return area;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
