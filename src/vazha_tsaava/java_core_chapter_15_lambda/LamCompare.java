package vazha_tsaava.java_core_chapter_15_lambda;

import java.util.ArrayList;
import java.util.Collections;

public class LamCompare {
    public LamCompare() {
    }

    static int compare(MyClass a, MyClass b) {
        return a.getValue() - b.getValue();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> list = new ArrayList();

        for(int i = 0; i <= 13; ++i) {
            list.add(new MyClass(i));
        }

        MyClass obj = (MyClass) Collections.max(list, LamCompare::compare);
        System.out.println(obj.getValue());
    }
}
