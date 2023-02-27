/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkg1;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operario[] operario = new Operario[15];
        Comissionado[] comissionado = new Comissionado[15];
        Faxineiro[] faxineiro = new Faxineiro[15];
        
        String nome;
        int cpf, rg, numCarteira, setor;
        double valorVendido, comissao;
        
        int op = 0;
        int n = 0, f = 0, j = 0; //Contadores de Funcionário
        
        while(op != 4) {
            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Cadastrar Funcionário");
            System.out.println("2) Listar Funcionários Cadastrados");
            System.out.println("3) Folha salarial");
            System.out.println("4) Sair");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {
                //Cadastro
                case 1:
                    System.out.println("======== Cadastro =======");
                    System.out.println("1) Operario");
                    System.out.println("2) Comissionado");
                    System.out.println("3) Faxineiro");
                    System.out.println("4) Voltar");
                    System.out.println("=========================");
                    op = sc.nextInt();

                    switch(op) {
                        case 1:
                            if(n < 15) {
                                System.out.print("Digite o nome do Funcionário: ");
                                nome = sc.next();

                                System.out.print("Digite o CPF do Funcionário: ");
                                cpf = sc.nextInt();

                                System.out.print("Digite o RG do Funcionário: ");
                                rg = sc.nextInt();

                                System.out.print("Digite o Número da Carteira do Funcionário: ");
                                numCarteira = sc.nextInt();

                                System.out.print("Digite o Setor do Funcionário(1 ou 2): ");
                                setor = sc.nextInt();

                                if(setor == 1) {
                                    operario[n] = new Operario(nome, cpf, rg, numCarteira, 5000, 2000);
                                    n++;
                                }
                                else if(setor == 2) {
                                    operario[n] = new Operario(nome, cpf, rg, numCarteira, 5000, 800);
                                    n++;
                                }
                                else{
                                    System.out.println("Erro no cadastro.");
                                }
                            }
                            else
                                System.out.println("Limite de Operários atingido.");
                            
                            break;

                        case 2:
                            if(n < 15) {
                                System.out.print("Digite o nome do Funcionário: ");
                                nome = sc.next();

                                System.out.print("Digite o CPF do Funcionário: ");
                                cpf = sc.nextInt();

                                System.out.print("Digite o RG do Funcionário: ");
                                rg = sc.nextInt();

                                System.out.print("Digite o Número da Carteira do Funcionário: ");
                                numCarteira = sc.nextInt();

                                System.out.print("Informe o valor vendido nesse mês: ");
                                valorVendido = sc.nextDouble();
                                
                                System.out.print("Digite a comissao (em porcentagem): ");
                                comissao = sc.nextInt();
                                comissao = comissao / 100;

                                comissionado[f] = new Comissionado(nome, cpf, rg, numCarteira, 6000, valorVendido, comissao);
                                f++;
                            }
                            else
                                System.out.println("Limite de Operários atingido.");
                            
                            break;

                        case 3:
                            if(n < 15) {
                                System.out.print("Digite o nome do Funcionário: ");
                                nome = sc.next();

                                System.out.print("Digite o CPF do Funcionário: ");
                                cpf = sc.nextInt();

                                System.out.print("Digite o RG do Funcionário: ");
                                rg = sc.nextInt();

                                System.out.print("Digite o Número da Carteira do Funcionário: ");
                                numCarteira = sc.nextInt();

                                faxineiro[j] = new Faxineiro(nome, cpf, rg, numCarteira, 1200);
                                j++;
                            }
                            else
                                System.out.println("Limite de Operários atingido.");
                            break;

                        case 4:
                            op = 0;
                            break;

                        default:
                            System.out.println("Valor inválido.");
                            break;
                    }
                    break;

                //Listar Funcionários
                case 2:
                    System.out.println("");
                    System.out.println("Operarios: ");

                    for(int i=0; i < n; i++) {
                        operario[i].showOperario();
                    }
                    
                    System.out.println("");
                    System.out.println("Comissionados: ");

                    for(int i=0; i < f; i++) {
                        comissionado[i].showComissionado();
                    }
                    
                    System.out.println("");
                    System.out.println("Faxineiros: ");

                    for(int i=0; i < j; i++) {
                        faxineiro[i].showFaxineiro();
                    }
                    
                    break;

                //Folha Salarial
                case 3:
                    double salarioTotalOp = 0, salarioTotalCom = 0, salarioTotalFax = 0;
                    
                    System.out.print("Folha Salarial Operários: ");
                    for(int i=0; i < n; i++) {
                        salarioTotalOp = salarioTotalOp + operario[i].salarioTotal();  
                    }
                    System.out.println(salarioTotalOp);
                    
                    System.out.print("Folha Salarial comissionados: ");
                    for(int i=0; i < f; i++) {
                        salarioTotalCom = salarioTotalCom + comissionado[i].salarioTotal();  
                    }
                    System.out.println(salarioTotalCom);
                    
                    System.out.print("Folha Salarial Faxineiro: ");
                    for(int i=0; i < j; i++) {
                        salarioTotalFax = salarioTotalFax + faxineiro[i].salarioTotal();  
                    }
                    System.out.println(salarioTotalFax);                   
                    
                    System.out.print("Folha Salarial Total: ");
                    System.out.println(salarioTotalOp + salarioTotalCom + salarioTotalFax);  

                    break;

                case 4:
                    op = 4;
                    break;

                default:
                    System.out.println("Valor inválido.");
                    break;
            }
        }
        
    sc.close();
    }
    
}
