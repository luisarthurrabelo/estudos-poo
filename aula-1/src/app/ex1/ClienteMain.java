package app.ex1;
import java.util.Scanner;

public class ClienteMain {
    public static void main(String[] args) throws Exception {

        Cliente obj1 = new Cliente();
        Scanner sc = new Scanner(System.in);
        String nome, CPF, telefone;
        int idade;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("CPF: ");
        CPF = sc.nextLine();
        System.out.print("Telefone: ");
        telefone = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();

        obj1.cadastraCliente(nome, CPF, telefone, idade);
        obj1.MostrarDadosCliente();

        sc.close();
    }
}