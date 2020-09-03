package estruturadecontrole;

import java.util.Scanner;

public class DesafioNumeroPrimo {
    public static void main(String[] args) {
        System.out.println("Digite um numero para verificar se ele é primo");

        Scanner entrada = new Scanner(System.in);

        Double valor = entrada.nextDouble();

        if(
            (valor % 2 != 0) &&
            (valor % 3 != 0) &&
            (valor % 5 != 0) &&
            (valor % 7 != 0) &&
            (valor % 11 != 0)
        ){
            System.out.println("Numero é primo");
        }else {
            System.out.println("Numero nao é primo");
        }
    }
}
