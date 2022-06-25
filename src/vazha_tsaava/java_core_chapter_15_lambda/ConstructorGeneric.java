package vazha_tsaava.java_core_chapter_15_lambda;

public class ConstructorGeneric {
    interface MyFunc<T>{
        MyClass3<T> func(T n);
    }

    public static void main(String[] args) {
        MyFunc<Integer> myFunc = MyClass3<Integer> :: new;
        MyClass3<Integer> myClass3 = myFunc.func(132);
        System.out.println(myClass3.getValue());
    }
}
class MyClass3<T>{
    private T value;

    public MyClass3(T value) {
        this.value = value;
    }
    MyClass3(){
        value = null;
    }

    public T getValue() {
        return value;
    }
}
