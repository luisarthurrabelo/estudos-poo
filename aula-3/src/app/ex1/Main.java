package app.ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        int op = 0;
        int ap = 0;
        int quantidadeInserida = 0;

        System.out.print("Informe o preço da passagem para gerar a máquina: ");
        p = sc.nextInt();

        Tempo tempo = new Tempo(0, 0, 0);
        PassMachine passMachine = new PassMachine(p);

        while(op != 2) {
            System.out.println("");
            System.out.println("======== MENU =======");
            System.out.println("1) Inserir valor na máquina");
            System.out.println("2) Desligar");
            System.out.println("=====================");
            op = sc.nextInt();

            switch(op) {
                case 1:
                    System.out.print("Quanto deseja inserir? ");
                    quantidadeInserida = sc.nextInt();
                    passMachine.pagamento(quantidadeInserida);
                    
                    if(passMachine.getPass()) {
                        while(ap != 8) {
                            System.out.println("");
                            System.out.println("======== MENU =======");
                            System.out.println("1) Definir horário:");
                            System.out.println("2) Mostar horas (24h)");
                            System.out.println("3) Mostar horas (AM/PM)");
                            System.out.println("4) Incrementar minutos");
                            System.out.println("5) Decrementar minutos");
                            System.out.println("6) Incrementar segundos");
                            System.out.println("7) Decrementar segundos");
                            System.out.println("8) Finalizar");
                            System.out.println("=====================");
                            ap = sc.nextInt();

                            switch(ap) {
                                case 1:
                                    System.out.print("horas: ");
                                    int hora = sc.nextInt();

                                    System.out.print("Minutos:");
                                    int minuto = sc.nextInt();

                                    System.out.print("Segundos: "); 
                                    int segundo = sc.nextInt();

                                    tempo = new Tempo(hora, minuto, segundo);
                                    break;

                                case 2:
                                    tempo.mostarTempo24hrs();
                                    break;

                                case 3:
                                    tempo.mostarTempo12hrs();
                                    break;

                                case 4:
                                    tempo.incrementaMinuto();
                                    break;
                                    
                                case 5:
                                    tempo.decrementaMinuto();
                                    break;

                                case 6:
                                    tempo.incrementaSegundo();
                                    break;

                                case 7:
                                    tempo.decrementaSegundo();
                                    break;
                                
                                case 8:
                                    ap = 8;
                                    break;

                                default:
                                    System.out.println("Valor inválido.");
                                    break;
                            }
                        }
                    }

                    break;

                case 2:
                    break;

                default:
                    System.out.println("Valor inválido.");
                    break;
            }
        }

        sc.close();
    }
}
