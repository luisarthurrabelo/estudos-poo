package app.ex1;
import java.util.ArrayList;

public class DVD extends Locadora{
    ArrayList<String> atores = new ArrayList<String>();
    private String diretor;
    private int tempoDuracao, classEtaria;
    
    public DVD(String nome, String tipo, String genero, int anoProd, int numCopias, double preco,
    ArrayList<String> atores, String diretor, int tempoDuracao, int classEtaria) {
        
        super(nome, tipo, genero, anoProd, numCopias, preco);
        this.atores = atores;
        this.diretor = diretor;
        this.tempoDuracao = tempoDuracao;
        this.classEtaria = classEtaria;
        
    }
    
    public void showDVD() {
        System.out.println(super.getNome() + " | " + super.getTipo() + " | " + super.getGenero() + " | " + super.getAnoProd() + " | " + super.getNumCopias() + " | " + super.getPreco() + " | " + 
                            atores + " | " + diretor + " | " + tempoDuracao + " | " + classEtaria);
    }

    public ArrayList<String> getAtores() {
        return atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public int getClassEtaria() {
        return classEtaria;
    }
}
