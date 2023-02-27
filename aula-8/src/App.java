import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Empregado> t = new ArrayList<Empregado>();
        //HashMap<Integer, Empregado> empregados = new HashMap<Integer, Empregado>();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        String cpf;
        int idade;
        float salario;
        Boolean existeCpf = false;

        while(op != 4) {
            Iterator<Empregado> iter = t.iterator();

            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Adicionar empregado");
            System.out.println("2) Procurar por CPF");
            System.out.println("3) Ver salários");
            System.out.println("4) Sair");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {
                
                case 1:

                    System.out.println("Digite o CPF: ");
                    cpf = sc.next();

                    System.out.println("Digite a idade: ");
                    idade = sc.nextInt();

                    System.out.println("Digite o salário: ");
                    salario = sc.nextFloat();;

                    t.add(new Empregado(cpf, idade, salario));
                    //empregados.put(cont++, new Empregado(cpf, idade, salario));
                    Collections.sort(t);
                    
                    break;

                case 2:

                    System.out.println("Digite o cpf:");
                    cpf = sc.next();

                    
                    while (iter.hasNext()) {
                        Empregado num = iter.next();
                        
                        if(num.getCpf().equals(cpf)) {
                            System.out.println(num);
                            existeCpf = true;
                            //iter.remove();       Caso eu queria remover :D
                            break;
                        }
                    }
                    

                    /*
                    for(Empregado t:empregados.values()) {
                        if(t.getCpf().equals(cpf)) {
                            System.out.println(t);
                            existeCpf = true;
                            break;
                        }
                    }
                    */

                    if(existeCpf == false) {
                        System.out.println("Cpf não encontrado.");
                    }
                    
                    existeCpf = false;
                    break;
                    
                case 3:

                    System.out.println("Digite o salário base:");
                    salario = sc.nextFloat();

                    while (iter.hasNext()) {
                        Empregado num = iter.next();
                        
                        if(num.getSalario() > salario) {
                            System.out.println(num);
                        }
                    }
                    
                    /*
                    for(Empregado t:empregados.values()) {
                        if(t.getSalario() > salario) {
                            System.out.println(t);
                        }
                    }
                    */

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
