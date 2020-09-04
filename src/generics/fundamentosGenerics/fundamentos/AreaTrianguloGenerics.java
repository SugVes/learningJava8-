package generics.fundamentosGenerics.fundamentos;

import java.util.Scanner;

public class AreaTrianguloGenerics<T extends  Number, U extends Number> {

    public void area(T base, U height){
        System.out.printf("A area do triangulo é %.2f", (base.doubleValue() * height.doubleValue())/2);
    }
}
