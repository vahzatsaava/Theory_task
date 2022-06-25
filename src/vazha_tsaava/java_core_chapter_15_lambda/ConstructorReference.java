package vazha_tsaava.java_core_chapter_15_lambda;

public class ConstructorReference {
    interface MyFunc {
        MyClass2 func(int n);
    }

    public static void main(String[] args) {
        MyFunc myFunc = MyClass2::new;
        MyClass2 myClass2 = myFunc.func(10);
        System.out.println(myClass2.getValue());
    }
}

class MyClass2 {
    private int value;
//конструктор с одним аргументом
    public MyClass2(int value) {
        this.value = value;
    }
    //конструктор по умолчанию
    public MyClass2 (){
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
