package vazha_tsaava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ReduceExampl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add( i + 1);
        }
        //��� ������� ��������� ���������� ������������ ������������� ��������� list
        Optional<Integer> productObj = list.stream().reduce((a,b) -> a * b);
        if (productObj.isPresent()){
            System.out.println("������������ � ���� ������� ���� Optional " + productObj.get());
        }
        int prod = list.stream().reduce(1,(a,b) -> a * b);
        System.out.println("������������ � ���� �������� ���� int " + prod);

        List<Double> listDouble = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listDouble.add((double) (i + 1));
        }
        double nums = listDouble.parallelStream().reduce(1.0,(a,b) -> a * Math.sqrt(b),(a,b) -> a * b);
        System.out.println("������������ ���������� ������ " + nums);
    }
}
