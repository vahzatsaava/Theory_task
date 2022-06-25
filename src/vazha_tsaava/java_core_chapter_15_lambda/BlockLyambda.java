package vazha_tsaava.java_core_chapter_15_lambda;

public class BlockLyambda {
    public BlockLyambda() {
    }

    public static void main(String[] args) {
        BlockLyambda.NumericVal numericVal = (a) -> {
            int result = 1;

            for(int i = 0; i < a; ++i) {
                result *= a;
            }

            return result;
        };
        System.out.println("Факториал числа 5 равен " + numericVal.func(5));
        System.out.println("Факториал числа 8 равен " + numericVal.func(8));
        BlockLyambda.StringFunc stringFunc = (s) -> {
            return (new StringBuilder(s)).reverse().toString();
        };
        System.out.println("Переворачиваем строку - " + stringFunc.reverse("Привет"));
        BlockLyambda.SumFunction<String> reverseS = (s) -> {
            return (new StringBuilder(s)).reverse().toString();
        };
        System.out.println((String)reverseS.function("До Свидания !"));
    }

    interface NumericVal {
        int func(int var1);
    }

    interface StringFunc {
        String reverse(String var1);
    }

    interface SumFunction<T> {
        T function(T var1);
    }
}
