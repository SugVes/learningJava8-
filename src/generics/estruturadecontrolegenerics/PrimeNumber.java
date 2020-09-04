package generics.estruturadecontrolegenerics;

public class PrimeNumber<T extends Number> {

    public  String varifyIfNumberIsPrime(T value) {

        String msg;

        if( (value.intValue() % 2 != 0) &&
            (value.intValue() % 3 != 0) &&
            (value.intValue() % 5 != 0) &&
            (value.intValue() % 7 != 0) &&
            (value.intValue() % 11 != 0)){
            msg = "Numero é primo";
        }else {
            msg = "Numero não é primo";
        }

        return msg;
    }
}
