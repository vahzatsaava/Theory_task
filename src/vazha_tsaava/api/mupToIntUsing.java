package vazha_tsaava.api;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class mupToIntUsing {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add((double) i);
        }

        list.forEach(a -> System.out.print(a +" "));

        IntStream stream = list.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.println("максимально допустимые пределы значений из списка list");
        stream.forEach(a -> System.out.print(a + " "));
    }
}
