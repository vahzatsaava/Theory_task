package vazha_tsaava.java_core_chapter_15;

public class FirstExample {
    public FirstExample() {
    }

    public static void main(String[] args) {
        FirstExample.MyNumber myNumber = (a, b) -> {
            return a / 10 + b * 2;
        };
        System.out.println(myNumber.getValue(30, 4));
    }

    interface MyNumber {
        int getValue(int var1, int var2);
    }
}
