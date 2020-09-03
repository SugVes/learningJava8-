package fundamentos;

import java.util.Scanner;

public class CalculoQuadradoCudo {
    public static void main(String[] args) {
        System.out.println("Digite um numero\n");

        Scanner entrada = new Scanner(System.in);

        Double valor = entrada.nextDouble();

        Double quadrado = valor * valor;
        Double cubo = valor * valor * valor;

        System.out.println("Quadrado " + quadrado);
        System.out.println("Cudo " + cubo);

    }
}
