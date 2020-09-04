package generics.estruturadecontrolegenerics;

public class AverageGenerics<T extends Number, U extends Number> {

    public void calculateAverage(T gradeOne, U gradeTwo){

        if(((gradeOne.doubleValue() + gradeTwo.doubleValue()) / 2) >= 7){
            System.out.println("Aprovado");
        }else if ((((gradeOne.doubleValue() + gradeTwo.doubleValue()) / 2) < 7) && ((gradeOne.doubleValue() + gradeTwo.doubleValue()) / 2) >= 4) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
