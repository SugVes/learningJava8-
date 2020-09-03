package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        System.out.println("Digite o tamanho da base\n");

        Scanner entrada = new Scanner(System.in);
        Double base = entrada.nextDouble();

        System.out.println("Digite a altura\n");
        Double altura = entrada.nextDouble();

        Double area = (base * altura )/2;

        System.out.printf("A area do triangulo é %.2f", area);
    }
}
