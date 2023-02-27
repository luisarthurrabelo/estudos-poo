package app.ex1;

public class PassMachine {
    private int preco;
    private int quantidadeInserida;
    private int troco;
    private Boolean pass = false;

    public PassMachine(int p) {
        preco = p;
        quantidadeInserida = 0;
        troco = 0;
    }

    public Boolean getPass() {
        return pass;
    }

    public void pagamento(int p) {
        quantidadeInserida = p;

        if(p < preco && (troco + p != preco)) {
            //Falta dinheiro
            System.out.println("Faltam " + (preco - p) + "R$ a serem inserido(s).");
            troco = troco + quantidadeInserida;
            pass = false;
        }
        else if(p == preco && troco == 0) {
            //Ingresso adquirido
            //Sem troco
            System.out.println("A passagem foi paga com sucesso.");
            System.out.println("O seu troco é: " + ((p - preco) + troco));
            pass = true;
        }
        else if(p >= preco || (troco + p == preco)) {
            //Ingresso adquirido
            //Troco
            System.out.println("A passagem foi paga com sucesso.");
            System.out.println("O seu troco é: " + ((p - preco) + troco));
            troco = 0;
            pass = true;
        }
    }
}
