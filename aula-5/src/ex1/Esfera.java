package ex1;

public class Esfera extends FormaTridimensional{
    private float raio;

    public Esfera(String cor, int x, int y, int z, float raio) {
        super(cor, x, y, z);
        this.raio = raio;
    }

    public double obterVolume(float raio) {
        return ((4/3) * Math.PI * (raio * raio * raio));
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
