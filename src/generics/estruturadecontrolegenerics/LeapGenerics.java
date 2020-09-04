package generics.estruturadecontrolegenerics;

public class LeapGenerics <T extends Number> {

    public void verifyIfYearIsLeap(T year) {

        if ((year.intValue() % 4 == 0) && (year.byteValue() % 100 != 0)
                || (year.byteValue() % 4 == 0) && (year.byteValue() % 100 == 0)
                && (year.byteValue() % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano nao é bissexto");
        }
    }
}
