package lambdas.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Maria", "Bruna", "Deise", "Edna", "Fabiola", "Geisa", "Hilda", "Inês");

        System.out.println("\nLambda #1");
        aprovados.forEach(nome -> System.out.println(nome));

        AtomicInteger contador = new AtomicInteger(1);
//        aprovados.forEach(nome -> {
//            System.out.println("Nome:" + contador + " " + nome);
//            contador.getAndIncrement();
//        });

        System.out.println("\nLambda com contador");
        aprovados.forEach(x -> System.out.println("Name "+contador.getAndIncrement()+": "+x));

        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);

        System.out.println("\nMethod Reference custom");
        aprovados.forEach(ForEach::myImpressao);

        System.out.println("\nLambda method custom");
        aprovados.forEach(name -> myImpressao(name));

    }

    static void myImpressao(String name){
        System.out.println("My name is:" + name);
    }
}
