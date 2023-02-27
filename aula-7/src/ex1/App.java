package ex1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Conta[] conta = new Conta[5];
        int op = 0;

        String nome;
        float valor;
        Boolean existeConta = false;
        int i = 0;

        conta[0] = new Conta("Maria", 1000, 1234);
        conta[1] = new Conta("Pedro", 23000, 1235);
        conta[2] = new Conta("Fernanda", 1500, 1236);
        conta[3] = new Conta("Otávio", 200, 1237);
        conta[4] = new Conta("Ricardo", 900, 1238);

        while(op != 3) {
            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Sacar");
            System.out.println("2) Depositar");
            System.out.println("3) Sair");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {
                case 1:
                    i = 0;

                    System.out.println("Digite o Nome: ");
                    nome = sc.next();

                    for (i = 0; i < 4; i++) {
                        if(nome.equals(conta[i].getNome())) {
                            existeConta  = true;
                            break;
                        }
                    }

                    if(existeConta == false) {
                        System.out.println("Conta não encontrada");
                    }

                    else {
                        System.out.println("Digite o valor a sacar: ");
                        valor = sc.nextFloat();
    
                        try {
                            conta[i].sacar(valor);
                        }  
                        catch (NewException e) {
                            System.out.println(e.getMessage());
                        }
                        
                        existeConta  = false;
                    }
                    break;

                case 2:

                    i = 0;

                    System.out.println("Digite o Nome: ");
                    nome = sc.next();

                    for (i = 0; i < 4; i++) {
                        if(nome.equals(conta[i].getNome())) {
                            existeConta  = true;
                            break;
                        }
                    }

                    if(existeConta == false) {
                        System.out.println("Conta não encontrada");
                    }

                    else {
                        System.out.println("Digite o valor a sacar: ");
                        valor = sc.nextFloat();
    
                        try {
                            conta[i].depositar(valor);
                        }  
                        catch (NewException e) {
                            System.out.println(e.getMessage());
                        }

                        existeConta  = false;
                    }
                    break;
                    
                case 3:
                    op = 3;
                    break;

                default:
                    System.out.println("Valor inválido.");
                    break;
            }
        }

        sc.close();
    }
}
