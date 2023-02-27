package ex1;

public class Circulo extends FormaBidimensional{
    private float raio;

    public Circulo(String cor, int x, int y, float raio) {
        super(cor, x, y);
        this.raio = raio;
    }

    public double obterArea(float raio) {
        return (Math.PI * (raio * raio));
    }

    public Boolean interceta(Circulo c) {

        int xDiff = this.getX() - c.getX();
        int yDiff = this.getY() - c.getY();

        double distanceCenters = Math.sqrt(Math.pow(xDiff,2) + Math.pow(yDiff,2));

        if(distanceCenters == (this.getRaio() + c.getRaio())) {
            return true;
        }
        if(distanceCenters > (this.getRaio() + c.getRaio())) {
            return false;
        }
        if(distanceCenters < (this.getRaio() + c.getRaio())) {
            return true;
        }
        else
            return null;
    }

    public float getRaio() {
        return raio;
    }
}
