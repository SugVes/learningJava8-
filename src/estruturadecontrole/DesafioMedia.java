package estruturadecontrole;

import java.util.Scanner;

public class DesafioMedia {
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota\n");

        Scanner entrada = new Scanner(System.in);

        Double n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota\n");
        Double n2 = entrada.nextDouble();

        if(((n1 + n2) / 2) >= 7){
            System.out.println("Aprovado");
        }else if ((((n1 + n2) / 2) < 7) && ((n1 + n2) / 2) >= 4) {
            System.out.println("Recuperacao");
        }else {
            System.out.println("Reprovado");
        }
    }
}
