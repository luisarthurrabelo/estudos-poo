package app.ex2;
import java.util.Scanner;

public class Main {
    public static void main(String a[]) {
        Circulo circulo = new Circulo();
        Ponto ponto = new Ponto();
        Scanner sc = new Scanner(System.in);

        float x, y;
        double raio;

        System.out.println("Informe o Centro do círculo: ");

        System.out.print("x: ");
        x = sc.nextFloat();
        System.out.print("y: ");
        y = sc.nextFloat();

        ponto.criaPonto(x, y);

        System.out.println("Informe o Raio do círculo: ");
        raio = sc.nextDouble();

        circulo.criarCirculo(ponto, raio);

        System.out.println("=======================================");
        System.out.println(" ");
        System.out.println("Dados do círculo de raio " + circulo.getRaio() + ": ");
        System.out.println("Diametro: " + circulo.calcularDiametro(circulo.getRaio()));
        System.out.println("Perímetro: " + circulo.calcularPerimetro(circulo.getRaio()));
        System.out.println("Área: " + circulo.calcularArea(circulo.getRaio()));
        System.out.println(" ");
        System.out.println("=======================================");

        sc.close();
    }
}
