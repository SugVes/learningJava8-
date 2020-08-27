package lambdas.unaryOperator;


import java.util.function.UnaryOperator;

public class OperacaoUnaria {
    public static void main(String[] args) {
        UnaryOperator<String> firstName = name -> name;
        UnaryOperator<String> middleName = name -> name + " Silva";
        UnaryOperator<String> lastName = name -> name + " Lima";

        String fullName = firstName
                .andThen(middleName)
                .andThen(lastName)
                .apply("Gui");

        System.out.println("And Then\n");
        System.out.println(fullName);

        System.out.println("Compose\n");
        String composeFullName = lastName
                .compose(middleName)
                .compose(firstName)
                .apply("Gui");

        System.out.println(composeFullName);

    }
}
