package vazha_tsaava.java_core_chapter_15;


public class ReferenceOn {
    public ReferenceOn() {
    }

    static <T> int myOp(ReferenceOn.MyFunc<T> f, T[] val, T v) {
        return f.func(val, v);
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 44, 5, 6, 7, 8, 9, 0, 1, 1, 1, 1};
        int res = myOp(MyArraysOps::countMatching, arr, 0);
        System.out.println("колличество 0:" + res);
    }

    interface MyFunc<T> {
        int func(T[] var1, T var2);
    }
}