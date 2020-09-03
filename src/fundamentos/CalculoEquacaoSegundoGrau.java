package fundamentos;

import java.util.Scanner;

public class CalculoEquacaoSegundoGrau {
    public static void main(String[] args) {

        System.out.println("Digite o valor de a");

        Scanner entrada = new Scanner(System.in);
        Double a = entrada.nextDouble();

        System.out.println("Digite o valor de b");
        Double b = entrada.nextDouble();

        System.out.println("Digite o valor de c");
        Double c = entrada.nextDouble();

        Double delta = (b * b) - (4 * a * c);

        Double primeiraRaiz = (- b + (Math.sqrt(delta))) / ( 2 * a);
        Double segundaRaiz = (- b - (Math.sqrt(delta))) / ( 2 * a);

        System.out.printf("Valor da primeira raiz %.2f %n", primeiraRaiz);
        System.out.printf("Valor da segunda raiz %.2f", segundaRaiz);

    }
}
