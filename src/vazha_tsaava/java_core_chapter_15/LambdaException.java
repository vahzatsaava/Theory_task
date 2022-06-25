package vazha_tsaava.java_core_chapter_15;

import java.util.Arrays;

public class LambdaException {
    public LambdaException() {
    }

    public static void main(String[] args) {
        double[] arr = new double[]{1.1D, 4.9D, 3.3D, 5.5D, 10.6D};
        LambdaException.DoubleArrayFunc doubleArrayFunc = (s) -> {
            return Arrays.stream(s).average().orElse(0.0D);
        };

        try {
            System.out.println(doubleArrayFunc.func(arr));
        } catch (LambdaException.EmptyArrayException var4) {
            var4.printStackTrace();
        }

    }

    interface DoubleArrayFunc {
        double func(double[] var1) throws LambdaException.EmptyArrayException;
    }

    class EmptyArrayException extends Exception {
        EmptyArrayException() {
            super("Массив пуст");
        }
    }
}

