package ex3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int[] inteiros = new int[10];
        int op = 0;
        int i;

        int num = -1, pos = -1;

        while(op != 3) {
            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Guardar número");
            System.out.println("2) Vizualizar sequência");
            System.out.println("3) Sair");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {

                case 1:

                    System.out.println("Digite o número a ser inserido: ");

                    while(num == -1) {
                        try {
                            num = sc.nextInt();
                        } 
                        catch(InputMismatchException e) { 
                            System.out.println("Número inválido");
                        }
                        sc.nextLine();
                    }
                    
                    System.out.println("Digite a posição a ser inserido: ");

                    while(pos == -1) {
                        try {
                            pos = sc.nextInt();
                        } 
                        catch(InputMismatchException e) { 
                            System.out.println("Número inválido");
                        }
                        sc.nextLine();
                    }
                      
                    try {
                        inteiros[pos] = Integer.valueOf(num);
                    }
                    catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("Espaço não está disponível!");
                    }

                    num = -1;
                    pos = -1;
                    break;

                case 2:

                    System.out.println("\n");

                    for(i = 0; i < 10; i++) {
                        System.out.println(inteiros[i]);
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
