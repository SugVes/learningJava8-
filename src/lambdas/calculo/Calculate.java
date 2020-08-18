package lambdas.calculo;

/** O conceito é de uma Interface que contém apenas um método abstrato, como é o caso de Runnable, por exemplo.
 * Porém é possível ter um método default com corpo e esse método consegue acessar o método abstrato executar, ou seja,
 * acessar o this, a instância da classe.
 * É permitido ter métodos staticos, entretanto, você nÃO tem acesso ao "this" a instância atual, logo não é possível
 * chamar o "executar" dentro do método statico
 * */
@FunctionalInterface
public interface Calculate {
    double execute(double x, double y);

    default String legal(){
        return "legal";
    }

    static String muitoLegal(){
        return "muito legal";
    }
}
