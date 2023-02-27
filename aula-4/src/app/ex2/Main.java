package app.ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Vendedor[] vendedor = new Vendedor[5];
        Administrativo[] administrativo = new Administrativo[5];
        Scanner sc = new Scanner(System.in);
        int op = 0;
        int ap = 0;
        String nome;
        int rg;
        int n = 0;
        int i = 0;

        while(op != 3) {
            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Criar funcionário");
            System.out.println("2) Verificar Salário");
            System.out.println("3) Sair");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {
                case 1:
                    System.out.println("");
                    System.out.println("======== Tipo de funcionário =======");
                    System.out.println("1) Vendedor");
                    System.out.println("2) Administrativo");
                    System.out.println("3) Voltar");
                    System.out.println("====================================");
                    ap = sc.nextInt();

                    switch(ap) {
                        case 1:
                            if(n >= 5){
                                System.out.println("Limite de vendedores atingido.");
                            }
                            else{
                                System.out.print("Nome: ");
                                nome = sc.next();

                                System.out.print("RG: ");
                                rg = sc.nextInt();

                                vendedor[n] = new Vendedor(nome, rg, 0, 4000);
                                n++;
                            }

                            break;
                        
                        case 2:
                            if(i >= 5){
                                System.out.println("Limite de administradores atingido.");
                            }
                            else{
                                System.out.print("Nome: ");
                                nome = sc.next();

                                System.out.print("RG: ");
                                rg = sc.nextInt();

                                administrativo[i] = new Administrativo(nome, rg, 0, 6000);
                                i++;
                            }

                            break;
        
                        case 3:
                            ap = 0;
                            break;
        
                        default:
                            System.out.println("Valor inválido.");
                            break;
                    }

                    break;

                case 2:
                    //Aumentar horas: Pega uma posição do vetor e aumenta as horas extra desse vendedor
                    //Aumentar venas: Pega uma posição do vetor e aumenta a venda feita por ele
                    //Pagar o salário de todos os funcionarios e imprimir o valor pago de cada um

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
