package app.ex2;
import java.util.Random;

public class NaveEspacial {
    Random rand = new Random();
    private String nome = "";
    private int velocidade = 0;
    
    public NaveEspacial(String nome) {
        int max = 10;
        int min = 5;
        int n = rand.nextInt((max - min) + 1) + min;
        
        this.nome = nome;
        velocidade = n;
    }

    public NaveEspacial(String nome, int velocidade) {
        
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void mostrarNave() {
        System.out.println("Nome: " + nome + " | Velocidade: " + velocidade);
    }
    
    public Boolean naveMaisRapida(NaveEspacial n) {
        if(n.getVelocidade() > this.getVelocidade()){
            return true;
        }
        else
            return false;
    }
}
