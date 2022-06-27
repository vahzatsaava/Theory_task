package vazha_tsaava.java_core_chapter_15_lambda;

public class ClassesFabric {
    interface MyFunc3<R,T>{
    R func(T n);
    }
    private static<R,T> R myClassFactory(MyFunc3<R,T> myFunc3,T n){
        return myFunc3.func(n);
    }

    public static void main(String[] args) {
        MyFunc3<MyClass4<Double>,Double> myFunc3 = MyClass4<Double>::new;
        MyClass4<Double> mc = myClassFactory(myFunc3,30.1);
        System.out.println(mc.getValue());
        MyFunc3<MyClass5,String> stringMyFunc3 = MyClass5::new;
        MyClass5 myClass5 = myClassFactory(stringMyFunc3,"hello");
        System.out.println(myClass5.getValue());
    }

}
class MyClass4<T>{
    private T value;

    public MyClass4(T value) {
        this.value = value;
    }
    MyClass4(){
        value = null;
    }

    public T getValue() {
        return value;
    }
}
class MyClass5{
    private String value;

    public MyClass5(String value) {
        this.value = value;
    }
    MyClass5(){
        value = null;
    }

    public String getValue() {
        return value;
    }
}
