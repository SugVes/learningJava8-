package fundamentos;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        System.out.println("Digite seu peso\n");

        Scanner entrada =  new Scanner(System.in);
        Double peso = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite sua altura\n");
        Double altura = Double.parseDouble(entrada.nextLine());

        Double resul = peso / (altura * altura);

        System.out.printf("Seu imc é %.2f",resul);

    }
}
