package vazha_tsaava.java_core_chapter_15_lambda;

public class NumericTest2 {
    public NumericTest2() {
    }

    public static void main(String[] args) {
        NumericTest2.NumericTest numericTest = (a, b) -> {
            return a % b == 0;
        };
        if (numericTest.test(10, 2)) {
            System.out.println("Является множителем");
        }

    }

    interface NumericTest {
        boolean test(int var1, int var2);
    }
}