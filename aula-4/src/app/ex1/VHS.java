package app.ex1;
import java.util.ArrayList;

public class VHS extends DVD {
    private Boolean status;

    public VHS(String nome, String tipo, String genero, int anoProd, int numCopias, double preco,
                ArrayList<String> atores, String diretor, int tempoDuracao, int classEtaria,
                Boolean status) {
        
        super(nome, tipo, genero, anoProd, numCopias, preco, atores, diretor, tempoDuracao, classEtaria);
        this.status = status;
    }

    public void showVHS() {
        System.out.println(super.getNome() + " | " + super.getTipo() + " | " + super.getGenero() + " | " + super.getAnoProd() + " | " + super.getNumCopias() + " | " + super.getPreco() + " | " + 
                            super.getAtores() + " | " + super.getDiretor() + " | " + super.getTempoDuracao() + " | " + super.getClassEtaria() + " | " + status);
    }
}
