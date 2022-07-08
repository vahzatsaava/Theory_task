package vazha_tsaava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MupExample {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add((double) (i + 1));
        }
        System.out.println(res(list));
    }
    public static Double res (List list){
        Stream<Double> sqrt = list.stream().map((a) -> Math.sqrt((Double) a));
        return sqrt.reduce(1.0,(a,b) -> a * b);
    }
}
