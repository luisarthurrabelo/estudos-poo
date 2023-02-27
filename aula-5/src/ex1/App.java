package ex1;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Forma> forma = new ArrayList<Forma>();
        int op = 0;

        while(op != 6) {
            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Cadastrar nova Forma");
            System.out.println("2) Mostrar descrição das formas cadastradas");
            System.out.println("3) Mostrar área das formas Bidimensional cadastradas");
            System.out.println("4) Mostrar volume das formas Tridimensional cadastradas");
            System.out.println("5) Verifique no vetor se existem duas esferas ou círculos que se interceptam");
            System.out.println("6) Sair");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {
                case 1:
                
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                case 5:
                    
                    break;
                    
                case 6:
                    
                    break;

                default:
                    
                    break;
            }
        }

        sc.close();
    }
}
