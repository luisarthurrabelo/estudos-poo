package app.ex2;
import java.util.Scanner;

public class AmbienteEspacial {  
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        NaveEspacial[] naveEspacial = new NaveEspacial[5];
        int op = 0;
        int n = 0;
        String nome;

        while(op != 4) {
            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Criar nova nave");
            System.out.println("2) Exibir naves existentes");
            System.out.println("3) Verificar nave mais rápida");
            System.out.println("4) Sair");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {
                case 1:
                    if (n <= 2){
                        System.out.print("Digite o nome da nave: ");
                        nome = sc.next();

                        naveEspacial[n] = new NaveEspacial(nome);
                        n++;
                    }
                    else if(n > 2 && n <= 4) {
                        System.out.println("Superpopulação de Naves.");
                        naveEspacial[n] = new NaveEspacial("Nave com defeito", 0);
                        n++;
                    }
                    if(n >= 5)
                        System.out.println("Limite de naves atingido.");
                        
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Naves: ");

                    for(int i=0; i < n; i++) {

                        if(naveEspacial[i].getVelocidade() == 0) {
                            System.out.print((i + 1) + ") ");
                            System.out.println("Nave inoperante.");
                        }
                        else{
                            System.out.print((i + 1) + ") ");
                            naveEspacial[i].mostrarNave();
                        }
                    }

                    break;

                case 3:
                    System.out.print("Digite o número da primeira nave: ");
                    int n1 = sc.nextInt();

                    System.out.print("Digite o número da segunda nave: ");
                    int n2 = sc.nextInt();

                    if(naveEspacial[n1 - 1].naveMaisRapida(naveEspacial[n2 - 1]) == true) {
                        System.out.println("A nave mais rápida é a segunda.");
                    }
                    else
                        System.out.println("A nave mais rápida é a primeira.");

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
