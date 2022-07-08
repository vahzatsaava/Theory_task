package vazha_tsaava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i += 4) {
            list.add(i);
        }
        System.out.println("»сходный список " + list);
        //получить поток элементов списочного массива
        Stream<Integer> stream = list.stream();
        //получить минимальные и максимальные значени€ вызвав метода max min isPresent и get
      Optional<Integer> minValue = list.stream().min(Integer::compare);
      if (minValue.isPresent()){
          System.out.println(minValue.get() + "- ћинимальное значение");
      }
      Optional<Integer> max = list.stream().max(Integer::compare);
      if (max.isPresent()){
          System.out.println(max.get() + " ћаксимальное значение");
      }
      Stream<Integer> sorted = list.stream().sorted();
      sorted.forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream<Integer> odds = list.stream().filter( i -> i % 6 == 0);
        odds.forEach(n -> System.out.print(n + " "));
    }
}
