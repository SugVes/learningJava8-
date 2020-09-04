package generics.estruturadecontrolegenerics;

import java.util.List;

public class GenericList {

    public static <T> T getLastElement(List<T> list){
        return list.get(list.size() - 1);
    }

}
