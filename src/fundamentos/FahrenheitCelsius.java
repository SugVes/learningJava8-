package fundamentos;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        System.out.println("Digite o valor em °F\n");

        Scanner entrada = new Scanner(System.in);

        Double valor = Double.valueOf(entrada.nextInt());
        Double resul = (valor - 32)/1.8;

        System.out.println("O valor é " + resul + "°F");
    }
}
