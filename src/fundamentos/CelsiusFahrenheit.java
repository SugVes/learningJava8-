package fundamentos;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        System.out.println("Digite o valor em °C\n");
        Scanner entrada = new Scanner(System.in);

        Double valor = Double.valueOf(entrada.nextInt());
        Double resul = 1.8 * valor + 32 ;

        System.out.println("Resultado da conversao é " + resul + "°F");

        entrada.close();
    }
}
