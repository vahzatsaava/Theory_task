package vazha_tsaava.java_core_chapter_15_lambda;

public class CounterTemp {
    public CounterTemp() {
    }

    public static <T> int counter(T[] values, CounterTemp.MyFunc<T> f, T v) {
        int count = 0;

        for(int i = 0; i < values.length; ++i) {
            if (f.func(values[i], v)) {
                ++count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CounterTemp.HighTemp[] tempArr = new CounterTemp.HighTemp[]{new CounterTemp.HighTemp(10), new CounterTemp.HighTemp(12), new CounterTemp.HighTemp(10), new CounterTemp.HighTemp(15), new CounterTemp.HighTemp(20), new CounterTemp.HighTemp(10)};
        int count = counter(tempArr, CounterTemp.HighTemp::sameTemp, new CounterTemp.HighTemp(12));
        System.out.println("Совпадающих дней " + count);
        CounterTemp.HighTemp[] dec = new CounterTemp.HighTemp[]{new CounterTemp.HighTemp(22), new CounterTemp.HighTemp(30), new CounterTemp.HighTemp(33), new CounterTemp.HighTemp(21), new CounterTemp.HighTemp(11)};
        int counter = counter(dec, CounterTemp.HighTemp::lessThenTemp, new CounterTemp.HighTemp(30));
        System.out.println("Дни которые меньше указанных " + counter);
    }

    interface MyFunc<T> {
        boolean func(T var1, T var2);
    }

    public static class HighTemp {
        private int highTemp;

        public HighTemp(int highTemp) {
            this.highTemp = highTemp;
        }

        public boolean sameTemp(CounterTemp.HighTemp temp) {
            return this.highTemp == temp.highTemp;
        }

        public boolean lessThenTemp(CounterTemp.HighTemp temp) {
            return this.highTemp < temp.highTemp;
        }
    }
}

