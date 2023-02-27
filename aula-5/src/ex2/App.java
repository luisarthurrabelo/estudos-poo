package ex2;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Funcionario[] func = new Funcionario[10];
        int op = 0;
        int n = 0;

        String nome, cpf;
        int matricula, idade, numVendas;
        double valorVendido;
        int numNoite;
        double valorNoite;

        while(op != 6) {
            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Cadastrar novo Funcionário");
            System.out.println("2) Pesquisar funcionário pelo CPF / Número de matrícula");
            System.out.println("3) Mostrar funcionários de cada categoria");
            System.out.println("4) Mostrar maior salário de cada categoria");
            System.out.println("5) Folha de pagamentos.");
            System.out.println("6) Sair");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {
                case 1:
                    System.out.println("======== Cadastro =======");
                    System.out.println("1) Comissionado");
                    System.out.println("2) Noturno");
                    System.out.println("4) Voltar");
                    System.out.println("=========================");
                    op = sc.nextInt();

                    switch(op) {

                        case 1:
                            if(n < 10) {
                                System.out.print("Digite a Matrícula: ");
                                matricula = sc.nextInt();

                                System.out.print("Digite o Nome: ");
                                nome = sc.next();

                                System.out.print("Digite a Idade: ");
                                idade = sc.nextInt();

                                System.out.print("Digite o CPF: ");
                                cpf = sc.next();

                                System.out.print("Informe o valor vendido nesse mês: ");
                                valorVendido = sc.nextDouble();

                                System.out.print("Informe o número de vendas: ");
                                numVendas = sc.nextInt();

                                func[n] = new FuncionarioComissionado(matricula, nome, idade, 3000.00, cpf, numVendas, valorVendido);
                                n++;
                            }
                            else
                                System.out.println("Limite de Operários atingido.");
                        
                        break;

                        case 2:
                            if(n < 10) {
                                System.out.print("Digite a Matrícula: ");
                                matricula = sc.nextInt();

                                System.out.print("Digite o Nome: ");
                                nome = sc.next();

                                System.out.print("Digite a Idade: ");
                                idade = sc.nextInt();

                                System.out.print("Digite o CPF: ");
                                cpf = sc.next();

                                System.out.print("Informe o número de Noites: ");
                                numNoite = sc.nextInt();

                                System.out.print("Informe o valor da noite: ");
                                valorNoite = sc.nextDouble();

                                func[n] = new FuncionarioNoturno(matricula, nome, idade, 3000.00, cpf, numNoite, valorNoite);
                                n++;
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

                case 2:
                    System.out.println("======== Pesquisar por: =======");
                    System.out.println("1) CPF");
                    System.out.println("2) Matrícula");
                    System.out.println("4) Voltar");
                    System.out.println("=========================");
                    op = sc.nextInt();

                    switch(op) {

                        case 1:
                            System.out.print("CPF: ");
                            cpf = sc.next();

                            for (int i = 0; i < n; i++) {
                                if(cpf.equals(func[i].getCpf())) {
                                    System.out.println(func[i]);
                                }
                            }
                        
                        break;

                        case 2:
                            System.out.print("Matrícula: ");
                            idade = sc.nextInt();
                            
                            for (int i = 0; i < n; i++) {
                                if(idade == func[i].getMatricula()) {
                                    System.out.println(func[i]);
                                }
                            }
                    
                        break;

                        case 4:
                            op = 0;

                        break;

                        default:
                            System.out.println("Valor inválido.");

                        break;
                    }
                    break;

                case 3:

                    System.out.println("");
                    System.out.println("Comissionados: ");

                    for(int i=0; i < n; i++) {
                        if(func[i] instanceof FuncionarioComissionado) {
                            System.out.println(func[i]);
                        }
                    }
                    
                    System.out.println("");
                    System.out.println("Noturnos: ");

                    for(int i=0; i < n; i++) {
                        if(func[i] instanceof FuncionarioNoturno) {
                            System.out.println(func[i]);
                        }
                    }
                
                    break;

                case 4:
                    int f = 0;
                    double maiorSalario;

                    System.out.println("");
                    System.out.println("Comissionados: ");

                    for(int i=0; i < n; i++) {
                        if(func[i] instanceof FuncionarioComissionado) {

                            maiorSalario = func[f].getSalarioMensal();

                            if(func[i].getSalarioMensal() > maiorSalario) {
                                f = i;
                            }
                        }
                    }

                    if(func[f] instanceof FuncionarioComissionado) {
                        System.out.println(func[f]);
                        System.out.println(func[f].getSalarioMensal());
                    }

                    f = 0;
                    
                    System.out.println("");
                    System.out.println("Noturnos: ");

                    for(int i=0; i < n; i++) {
                        if(func[i] instanceof FuncionarioNoturno) {

                            maiorSalario = func[f].getSalarioMensal();

                            if(func[i].getSalarioMensal() > maiorSalario) {
                                f++;
                            }
                        }
                    }

                    if(func[f] instanceof FuncionarioNoturno) {
                        System.out.println(func[f]);
                        System.out.println(func[f].getSalarioMensal());
                    }
                    
                    break;

                case 5:
                    double salarioTotalNot = 0, salarioTotalCom = 0;
                        
                    System.out.print("Folha Salarial Noturnos: ");
                    for(int i=0; i < n; i++) {
                        if(func[i] instanceof FuncionarioNoturno) {
                            salarioTotalNot = salarioTotalNot + func[i].getSalarioMensal();  
                        }
                    }
                    System.out.println(salarioTotalNot);
                    
                    System.out.print("Folha Salarial Comissionados: ");
                    for(int i=0; i < n; i++) {
                        if(func[i] instanceof FuncionarioComissionado) {
                            salarioTotalCom = salarioTotalCom + func[i].getSalarioMensal();  
                        } 
                    }
                    System.out.println(salarioTotalCom);            
                    
                    System.out.print("Folha Salarial Total: ");
                    System.out.println(salarioTotalCom + salarioTotalCom);      

                    break;
                    
                case 6:
                    op = 6;    

                    break;

                default:
                    System.out.print("Valor inválido");
                    break;
            }
        }

        sc.close();
    }
}