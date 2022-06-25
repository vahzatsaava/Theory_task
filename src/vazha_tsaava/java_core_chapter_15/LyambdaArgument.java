package vazha_tsaava.java_core_chapter_15;

public class LyambdaArgument {
    public LyambdaArgument() {
    }

    private static String stringOp(LyambdaArgument.StringFunc sf, String n) {
        return sf.func(n);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражение повышает эффективность языка Java";
        System.out.println("Исходная строка:" + inStr);
        String outStr = stringOp((str) -> {
            return str.toUpperCase();
        }, inStr);
        System.out.println("Строка в верхнем регистре:" + outStr);
        outStr = stringOp((str) -> {
            return str.replaceAll(" ", "");
        }, inStr);
        System.out.println(outStr);
        LyambdaArgument.StringFunc reverseString = (str) -> {
            StringBuilder revers = new StringBuilder();

            for(int i = str.length() - 1; i > 0; --i) {
                revers.append(str.charAt(i));
            }

            return revers.toString();
        };
        System.out.println(stringOp(reverseString, inStr));
    }

    interface StringFunc {
        String func(String var1);
    }
}
