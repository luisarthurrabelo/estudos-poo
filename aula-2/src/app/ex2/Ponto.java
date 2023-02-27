package app.ex2;

public class Ponto {
    private float px, py;

    public float getX() {
        return px;
    }

    public float getY() {
        return py;
    }

    void verificarNegativo(Ponto n) {
        if(n.getX() < 0) {
            n.px = 0;
        }
        if(n.getY() < 0) {
            n.py = 0;
        }
    }

    public double distanciaPontos(Ponto n1, Ponto n2) {
        return Math.sqrt(Math.pow(n1.getX() - n2.getX(), 2) + Math.pow(n1.getY() - n2.getY(), 2));
    }

    void criaPonto(float x, float y) { 
        px = x;
        py = y;
    }
}
