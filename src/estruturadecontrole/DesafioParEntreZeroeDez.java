package estruturadecontrole;

import java.util.Scanner;

public class DesafioParEntreZeroeDez {
    public static void main(String[] args) {
        System.out.println("Digite um numero entre 0 e 10");

        Scanner entrada =  new Scanner(System.in);
        Integer valor = entrada.nextInt();

        if((valor >= 0) && (valor <= 10) && (valor % 2 == 0)){
            System.out.println("Este numero é par e está entre 0 e 10");
        }
    }
}
