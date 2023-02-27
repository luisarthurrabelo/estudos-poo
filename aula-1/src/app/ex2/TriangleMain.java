package app.ex2;
import java.util.Scanner;

public class TriangleMain {

    static Triangle[] triangles = new Triangle[10];
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        float l1, l2, l3;
        int op = 0;
        int cont = 0;

        while(op != 5) {
            System.out.println("================= MENU ==================");
            System.out.println("1 - Inserir Triângulo");
            System.out.println("2 - Mostrar Triângulo cadastrados");
            System.out.println("3 - Quantidade de Triângulos equilátero");
            System.out.println("4 - Triângulo de maior perimetro");
            System.out.println("5 - Sair");
            System.out.println("=========================================");

            op = sc.nextInt();

            switch(op){
                case 1:
                    Triangle tri = new Triangle();

                    System.out.print("lado 1: ");
                    l1 = sc.nextInt();
                    System.out.print("lado 2: ");
                    l2 = sc.nextInt();
                    System.out.print("lado 3: ");
                    l3 = sc.nextInt();

                    tri.setLados(l1, l2, l3);
                    triangles[cont] = tri;
                    cont++;

                    break;

                case 2:
                    System.out.println("========= Triângulos Cadastrados =========");

                    for (int i = 0; i < cont; i++){
                        System.out.print("triangulo " + (i + 1) + ": ");
                        System.out.println(triangles[i].getLados());
                    }

                    System.out.println("==========================================");

                    break;
                
                case 3:
                    System.out.println("========= Triângulos Equiláteros ========");
                    int q = 0;

                    for (int i = 0; i < cont; i++){

                        if(triangles[i].tipoTriangulo(triangles[i].lado1, triangles[i].lado2, triangles[i].lado3) == 1){
                            System.out.print("triangulo " + (i + 1) + ": ");
                            System.out.println(triangles[i].getLados());
                            q++;
                        }
                    }
                    if(q == 0){
                        System.out.println("Não há nenhum triângulo equilátero");
                    }

                    System.out.println("=========================================");

                    break;
                
                case 4:
                    int t = 0;

                    System.out.println("===== Triângulo de maior Perimetro ======");

                    for (int i = 0; i < cont; i++){

                        if(triangles[i].perimetroTriangulo(triangles[i].lado1, triangles[i].lado2, triangles[i].lado3) 
                        > triangles[t].perimetroTriangulo(triangles[t].lado1, triangles[t].lado2, triangles[t].lado3))
                        {
                            t = i;
                        }
                    }

                    System.out.print("triangulo " + (t + 1) + ": ");
                    System.out.println(triangles[t].getLados());
                    System.out.println("=========================================");

                    break;

                case 5:
                    break;
                
                default:
                    System.out.println("Digite um valor válido");
                    break;
            }
        }

        sc.close();
    }
}
