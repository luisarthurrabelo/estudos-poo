package app.ex1;

public class Cliente {

    private static int ct = 0;
    private String nome, CPF, telefone;
    private int idade;

    void cadastraCliente(String n, String cpf, String t, int i) {
        nome = n;
        CPF = cpf;
        telefone = t;
        idade = i;
        ct++;
    }

    void MostrarDadosCliente(){
        System.out.println("======================================================");
        System.out.println("==================== Cliente " + ct + " =======================");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
        System.out.println("======================================================");
    }
}
