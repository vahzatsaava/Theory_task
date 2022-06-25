package vazha_tsaava.java_core_chapter_15;

import java.util.Objects;

public class StaticReference {
    public StaticReference() {
    }

    private static String opStr(StaticReference.StringFunc stringFunc, String s) {
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String res = "Привет мой добрый друг";
        String out = "";
        String in = "Java самый популярный язык програмиирования";
        out = opStr(StaticReference.MyStringOps::stringOps, res);
        System.out.println(out);
        StaticReference.NotStaticMethod notStaticMethod = new StaticReference.NotStaticMethod();
        Objects.requireNonNull(notStaticMethod);
        out = opStr(notStaticMethod::reverseStr, in);
        System.out.println(out);
    }

    interface StringFunc {
        String func(String var1);
    }

    public static class NotStaticMethod {
        public NotStaticMethod() {
        }

        public String reverseStr(String s) {
            return (new StringBuilder(s)).reverse().toString();
        }
    }

    public class MyStringOps {
        public MyStringOps() {
        }

        private static String stringOps(String s) {
            return (new StringBuilder(s)).reverse().toString();
        }
    }
}
